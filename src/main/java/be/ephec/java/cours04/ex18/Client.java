package be.ephec.java.cours04.ex18;

import org.jetbrains.annotations.NotNull;

public class Client {
    public void executePaiement(MoyenDePaiement moyen, double montant) {
        if (moyen == null)
            throw new IllegalArgumentException("MoyenDePaiement null");
        moyen.effectuerPaiement(montant);
    }
}
