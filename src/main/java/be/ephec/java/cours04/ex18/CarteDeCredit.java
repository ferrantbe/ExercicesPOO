package be.ephec.java.cours04.ex18;

public class CarteDeCredit implements Payement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("* * * Paiement CarteDeCredit");
        // authentifie la transaction puis le paiement est exécuté
        System.out.println("Authentification de la transaction");
        System.out.println("Exécution du paiement de " + montant);
    }
}
