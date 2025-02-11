package be.ephec.java.cours04.ex18;

public class CarteDeCredit implements MoyenDePaiement {

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Authentification de l'utilisateur...");
        System.out.printf("Exécution de la transaction de %.2f .%n", montant);
    }
}
