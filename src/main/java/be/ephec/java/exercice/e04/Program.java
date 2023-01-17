package be.ephec.java.exercice.e04;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Game game = new Game();

        Player winner = game.play();
        System.out.println("Et le gagnant est " + winner.getFirstName());

    }

}
