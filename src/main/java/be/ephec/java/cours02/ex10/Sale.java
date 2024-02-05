package be.ephec.java.cours02.ex10;

public class Sale {

    private final Car voiture;
    private final double prixCatalogue;
    private double reduction = 0;

    public Sale(Car voiture, double prixCatalogue) {
        this.voiture = voiture;
        this.prixCatalogue = prixCatalogue;
    }

    public void appliquerReduction(double reduction) {
        if (reduction >= 0 && reduction <= 1)
            this.reduction = reduction;
    }

    public double computeRealPrice(double reduction) {
        return this.prixCatalogue * (1 - reduction);
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(
                "Vente %s, prix catalogue = %.2f EUR, prix réel = %.2f EUR",
                voiture, prixCatalogue, this.computeRealPrice(this.reduction));
    }
}
