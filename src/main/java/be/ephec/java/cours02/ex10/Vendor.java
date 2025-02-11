package be.ephec.java.cours02.ex10;

public class Vendor extends Person {
    Sale[] sales = new Sale[10];
    int indice = 0;

    public Vendor(String lastName, String firstName, int yearOfBirth) {
        super(lastName, firstName, yearOfBirth);
    }

    public void vend(Sale sale, double reduction) {
        System.out.println("Vente de voiture...");
        sales[indice++] = sale;
        sale.appliquerReduction(reduction);
        sale.display();
        System.out.println();
    }
}
