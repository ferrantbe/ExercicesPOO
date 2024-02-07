package be.ephec.java.cours02.ex10;

public class Car {
    private final String marque;
    private final String modele;
    private final String numSerie;

    public Car(String marque, String modele, String numSerie) {
        this.marque = marque;
        this.modele = modele;
        this.numSerie = numSerie;
    }


    @Override
    public String toString() {
        return String.format("%s modèle %s [%s]", marque, modele, numSerie);
    }
}
