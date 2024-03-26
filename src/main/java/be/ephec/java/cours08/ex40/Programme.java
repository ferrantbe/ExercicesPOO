package be.ephec.java.cours08.ex40;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class Programme {
    public static void main(String[] args) {
        Calculateur[] calculateurs = {x -> 2 * x, x -> x * x, n -> 2 * n + 1};
        Set<Integer> entiers = new HashSet<>();
        genererListeEntiers(entiers);

        for (Calculateur calculateur : calculateurs){
            for (Integer i : entiers)
                traite(i, calculateur);
            System.out.println();
            }

    }


    private static void genererListeEntiers(Set<Integer> entiers) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            entiers.add(random.nextInt(100));
        }
    }

    public static void traite(int n, Calculateur calculateur) {
        System.out.printf("%d  ", calculateur.calcule(n));
    }
}
