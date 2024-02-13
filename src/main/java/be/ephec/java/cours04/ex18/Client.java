package be.ephec.java.cours04.ex18;

public class Client {
    public void executePaiement(Payement moyenDePayement, double montant){
        moyenDePayement.effectuerPaiement(montant);
    }
}
