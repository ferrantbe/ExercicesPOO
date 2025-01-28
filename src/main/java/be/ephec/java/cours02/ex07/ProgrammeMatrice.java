package be.ephec.java.cours02.ex07;

import java.util.Scanner;

public class ProgrammeMatrice {
    public static void main(String[] args) {
        System.out.println("Ce programme génère des matrices carrées ");
        System.out.print("Quelle taille de matrice voulez-vous générer? ");
        Scanner in = new Scanner(System.in);
        int taille = in.nextInt();

        int[][] tableau = new int[taille][];

        int nb = 1;
        // for i
        for (int i = 0; i < taille; i++) {
            tableau[i] = new int[taille];
            for (int j = 0; j < taille; j++) {
                tableau[i][j] = nb++;
            }
        }

        // Pour aligner les nombres, on construit la chaîne utilisée pour le formatage dans printf,
        // comme par exemple "%3d" qui formate le nombre en 3 chiffres.
        int tailleDePlusGrandNombre = ("" + nb).length();
        String formatage = "%" + (tailleDePlusGrandNombre + 1) + "d";

        // for each
        for (int[] ligne : tableau) {
            for (int valeur : ligne)
                System.out.printf(formatage, valeur);
            System.out.println();
        }
    }
}
