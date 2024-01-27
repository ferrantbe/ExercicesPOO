package be.ephec.java.ex07;

import java.util.Scanner;

public class ProgrammeMatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez la taille de la matrice carrée (n) : ");
        int n = scanner.nextInt();

        int[][] matrice = creerMatriceCarree(n);
        afficherMatriceCarree(matrice, n);

        scanner.close();
    }

    public static int[][] creerMatriceCarree(int taille) {
        int[][] matrice = new int[taille][taille];
        int nombre = 1;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                matrice[i][j] = nombre++;
            }
        }
        return matrice;
    }

    public static void afficherMatriceCarree(int[][] matrice, int taille) {
        System.out.println("\nMatrice résultante :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
