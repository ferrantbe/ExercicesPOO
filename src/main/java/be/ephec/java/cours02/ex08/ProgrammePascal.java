package be.ephec.java.cours02.ex08;

import java.util.Scanner;

public class ProgrammePascal {
    public static void main(String[] args) {
        System.out.println(
                "Ce programme calcule le triangle de Pascal jusqu'à la ligne spécifiée");


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
                // Affichage du triangle sous forme triangulaire
                // On utilise un décalage pour centrer les coefficients.
                for (int i = 0; i <= nbLines; i++) {
                    // Affichage des espaces pour centrer la ligne (nombre d'espaces décroissant)
                    for (int s = 0; s <= nbLines - i - 1; s++) {
                        System.out.print("  ");
                    }
                    // Affichage des coefficients de la ligne
                    for (int j = 0; j < triangle[i].length; j++) {
                        System.out.print(triangle[i][j] + "   ");
                    }
                    System.out.println();  // Passage à la ligne suivante
                }
            }

            System.out.print("Calculer un autre Triangle (O/N)? ");
            reponse = in.next().charAt(0);

        } while (reponse == 'O');

    }
}
