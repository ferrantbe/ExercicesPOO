package be.ephec.java.cours06.ex24;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Compte {
    private double solde = 0;

    private static Logger LOGGER = Logger.getLogger(Compte.class.getSimpleName());

    static {
        LOGGER.setLevel(Level.OFF);
    }
    private String numero = "";

    public double getSolde() {
        return solde;
    }

    public void ajoute(double montant) {
        solde +=  montant;
    }

    public double retire(double montant) {
        if (solde > montant){
            solde -= montant;
            return montant;
        } else {
            double ret = solde;
            solde = 0;
            return ret;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Compte16CharsException, CompteBEException, ModuloInexactException {
        if (numero.length() != 16)
            throw new Compte16CharsException("L’IBAN doit contenit 16 caractères, en contient " + numero.length());
        if(!numero.startsWith("BE"))
            throw new CompteBEException("L’IBAN doit commencer par BE - commence par " + numero.substring(0, 2));
        if(!moduloEstCorrect(numero))
            throw new ModuloInexactException("Le Modulo est incorrect.");

        this.numero = numero;
    }

    private boolean moduloEstCorrect(String numero) {

        LOGGER.log(Level.INFO, "Initial: " + numero);
        String s = numero.replaceAll("[^a-zA-Z0-9]", "");
        LOGGER.log(Level.INFO, "Replace all [^a-zA-Z0-9] by \"\": " + s);

        s = s.substring(4) + s.substring(0, 4);
        LOGGER.log(Level.INFO, "4 first digits at end: " + s);

        s = s.toUpperCase();
        LOGGER.log(Level.INFO, "To Upper Case: " + s);

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if ('0' <= c && c <= '9')
                sb.append(c);
            else
                sb.append(c - 'A' + 10);
        LOGGER.log(Level.INFO, "replace A-Z by numbers: " + sb);

        BigInteger bi = new BigInteger(sb.toString());
        int mod = bi.mod(new BigInteger("97")).intValue();
        LOGGER.log(Level.INFO, "Modulo 97: " + mod);

        return (mod == 1);

    }
}
