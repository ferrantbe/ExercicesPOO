package be.ephec.java.cours02.ex10;

public class ProgrammeDeVentes {
    public static void main(String[] args) {
        Vendor aTerieur = new Vendor("Terieur", "Alain", 1994);
        Car skoda = new Car( "Skoda", "Octavia", "RS14L33N/2");
        Car renault = new Car( "Renault", "Grand Scenic", "FR09883-R33");

        Sale sale1 = new Sale(renault, 25269);
        Sale sale2 = new Sale(skoda, 43545);

        aTerieur.vend(sale1, 0.2);
        aTerieur.vend(sale2, 0.1);
    }
}
