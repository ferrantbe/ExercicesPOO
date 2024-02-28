package be.ephec.java.cours06.ex23;

import java.util.Scanner;

public class GestionDeCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte();

        System.out.println("Solde du compte: " + c1.getSolde());
        System.out.println();
        System.out.println("Versement de 500.");
        c1.ajoute(500);
        System.out.println("Solde du compte: " + c1.getSolde());

        System.out.println();
        System.out.println("Retrait de 100.");
        double retrait;
        retrait = c1.retire(100);
        System.out.println("Solde du compte: " + c1.getSolde());
        System.out.println("Dernier retrait: " + retrait);

        System.out.println();
        System.out.println("Retrait de 500.");
        retrait = c1.retire(500);
        System.out.println("Solde du compte: " + c1.getSolde());
        System.out.println("Dernier retrait: " + retrait);

        System.out.println();
        System.out.println("Ajout du numéro de compte - entré par l'utilisateur...");

        demandeEtModifieNumeroDeCompte(c1);
        System.out.println("Numero de compte: " + c1.getNumero());

    }

    private static void demandeEtModifieNumeroDeCompte(Compte compte) {
        boolean compteOK = false;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Quel est le numéro de compte...? ");
            String numero = in.nextLine();
            try {
                compte.setNumero(numero);
                compteOK = true;
            } catch (Compte16CharsException | CompteBEException | ModuloInexactException e) {
                System.out.println("Numéro de compte " + numero + " invalide: " + e.getClass().getSimpleName());
                compteOK = false;
            }
        } while (compteOK != true);
    }
}
