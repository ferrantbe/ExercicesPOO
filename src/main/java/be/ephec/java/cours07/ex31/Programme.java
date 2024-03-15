package be.ephec.java.cours07.ex31;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Programme {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nombres = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            nombres.add(random.nextInt(1000));
        }

        Collections.sort(nombres);

        System.out.println("Avant suppression des pairs: ");
        System.out.println(nombres);
        System.out.println(nombres.size() + " nombres.");

        nombres.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        System.out.println();
        System.out.println("Après suppression des pairs: ");
        System.out.println(nombres);
        System.out.println(nombres.size() + " nombres.");
    }
}
