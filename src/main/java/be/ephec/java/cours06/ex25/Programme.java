package be.ephec.java.cours06.ex25;

import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        int t[];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Quelle taille de tableau? ");
            int n = sc.nextInt();
            try {
                t = new int[n];

                System.out.printf("Où mettre la valeur 12? ");
                int i = sc.nextInt();
                t[i] = 12;
            } catch (NegativeArraySizeException nase) {
                System.out.println(
                        "Impossible; la taille du tableau doit être un nombre positif.");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println(
                        "Impossible de mettre la valeur en dehors du tableau...");
            }
        } while (true);
    }
}
