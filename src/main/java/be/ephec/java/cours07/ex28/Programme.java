package be.ephec.java.cours07.ex28;
import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Combien de fiches voulez-vous introduire? ");
            n = sc.nextInt();
        } while(n <= 0 || n > 10);
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Quel nom? ");
            String nom = sc.nextLine();
            System.out.print("Quel numéro de téléphone? ");
            String numero = sc.nextLine();
            System.out.print("Quelle adresse? ");
            String adresse = sc.nextLine();
            System.out.println();

            Fiche fiche = new Fiche(nom, numero, adresse);
            annuaire.ajouter(nom, fiche);
        }

        System.out.print("Quelle fiche voulez-vous consulter (STOP pour arrêter)? ");
        String nom = sc.nextLine();
        while (! nom.equals("STOP")) {
            Fiche fiche = annuaire.getFiche(nom);
            System.out.println(fiche);

            System.out.print("Quelle autre fiche voulez-vous consulter? ");
            nom = sc.next();
        }

        System.out.println(annuaire);
    }
}
