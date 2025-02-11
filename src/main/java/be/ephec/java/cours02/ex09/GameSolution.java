package be.ephec.java.cours02.ex09;

import java.util.Random;

public class GameSolution {
    final Player p1, p2;
    int maxPoints;
    final Random dice = new Random();

    public GameSolution(Player p1, Player p2, int maxPoints) {
        this.p1 = p1;
        this.p2 = p2;
        this.maxPoints = maxPoints;
    }

    public Player playAndReturnWinner() {
        while (p1.getPoints() < maxPoints && p2.getPoints() < maxPoints)
            playNextRound();


        // remplacer l'instruction suivante par une instruction contenant un opérateur ternaire.
        // La méthode doit retourner le joueur qui a gagné (= celui qui a le plus de points).
        return p1.getPoints() > p2.getPoints() ? p1 : p2;
    }

    private void playNextRound() {
        int result1, result2;
        do {
            result1 = rollDice();
            result2 = rollDice();
        } while (result1 == result2);
        // insérer ici les instructions contenant l'opérateur ternaire
        // première instruction détermine le gagnant
        Player gagnant = result1 > result2 ? p1 : p2;
        // deuxième instruction augmente le score du gagnant
        gagnant.addPoint();
        //
    }

    private int rollDice() {
        return dice.nextInt(6);
    }

}
