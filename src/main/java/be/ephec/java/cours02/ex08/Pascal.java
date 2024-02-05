package be.ephec.java.cours02.ex08;

public class Pascal {
    /**
     * La méthode triangle retourne le triangle de Pascal jusqu'à la ligne nrLignes.
     * <p>
     * Le triangle de Pascal donne les coefficients des termes de l'identité remarquable (a+b)^n.
     * Les termes d'une ligne l sont calculés comme suit:
     * - le premier et le dernier terme de chaque ligne valent 1
     * - les autres termes (de colonne c) sont la somme du terme pascal[l-1][c-1] et pascal[l-1][c].
     *
     * @param nrLignes le numéro de la dernière ligne désirée, le tableau commençant à 0.
     * @return Le triangle de Pascal, sous forme d'un tableau de tableaux d'entiers. Chaque ligne contient un nombre différent d'entiers
     */
    public static int[][] triangle(int nrLignes) {
        // On vérifie d'abord si le nombre reçu est positif.
        if (nrLignes <= 0) {
            System.out.printf(
                    "Impossible de créer un triangle de Pasal pour un nombre < 0 (%d)\n", nrLignes);
            // Sinon on retourne un tableau null
            return null;
        }

        // On crée le tableau contenant n+1 lignes (il commence à 0)
        int[][] triangle = new int[nrLignes + 1][];

        // On  parcourt le tableau qui contient les lignes
        for (int ligne = 0; ligne <= nrLignes; ligne++) {
            // On crée le tableau qui contiendra la ligne; il contient ligne + 1 valeurs.
            triangle[ligne] = new int[ligne + 1];

            // Pour chaque ligne, le premier et le dernier terme valent 1.
            triangle[ligne][0] = 1;
            triangle[ligne][ligne] = 1;

            // Tous les autres termes sont parcourus
            for (int cellule = 1; cellule < ligne; cellule++)
                // et la cellule est calculée en fonction des valeurs de la ligne précédente
                triangle[ligne][cellule] = triangle[ligne - 1][cellule - 1] + triangle[ligne - 1][cellule];
        }

        return triangle;
    }
}
