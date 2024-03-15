package be.ephec.java.cours07.ex28;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Annuaire {
// Non trié    Map<String, Fiche> fiches = new TreeMap<String, Fiche>();
    Map<String, Fiche> fiches = new TreeMap<String, Fiche>();

    public void ajouter(String nom, Fiche fiche){
        fiches.put(nom, fiche);
    }

    public Fiche getFiche(String nom) {
        Fiche fiche = fiches.get(nom);
        return fiche;
    }

    @Override
    public String toString() {
        return fiches.toString();
    }
}
