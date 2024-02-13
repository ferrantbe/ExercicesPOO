package be.ephec.java.cours04.ex18;

public class PayPal implements Payement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("* * * Paiement PayPal");
        // connecter à Paypal, sélectionner un moyen de paiement et valider la transaction
        System.out.println("Connexion à Paypal");
        System.out.println("Sélection du moyen de paiement");
        System.out.println("Validation de la transaction de " + montant);
    }
}
