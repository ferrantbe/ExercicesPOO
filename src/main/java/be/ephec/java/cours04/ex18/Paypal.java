package be.ephec.java.cours04.ex18;

public class Paypal implements MoyenDePaiement {

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Connexion à Paypal...");
        System.out.println("Sélection du Moyen de paiement...");
        System.out.printf("Validation de la transaction de %.2f .%n", montant);
    }
}
