package be.ephec.java.cours02.ex08;

import java.util.Scanner;

public class ProgrammePascal {
    public static void main(String[] args) {
        System.out.println("Ce programme calcule le triangle de Pascal jusqu'à la ligne spécifiée");


        char reponse;
        do {
            System.out.println();
            System.out.print("Jusqu'à quelle ligne voulez-vous le calculer? ");
            Scanner in = new Scanner(System.in);
            int nbLines = in.nextInt();

            int[][] triangle = Pascal.triangle(nbLines);

            if (triangle == null)
                System.out.println(
                        "Valeur incorrecte entrée; impossible de calculer un triangle");
            else {
                for (int[] line : triangle) {
                    for (int val : line)
                        System.out.print(val + " ");
                    System.out.println();
                }
            }
            System.out.print("Calculer un autre Triangle (O/N)? ");
            reponse = in.next().charAt(0);

        } while (reponse == 'O');

    }
}
