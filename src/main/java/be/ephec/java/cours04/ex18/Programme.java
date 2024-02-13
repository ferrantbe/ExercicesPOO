package be.ephec.java.cours04.ex18;

public class Programme {
    public static void main(String[] args) {
        Client c = new Client();
        CarteDeCredit cc = new CarteDeCredit();
        PayPal p = new PayPal();

        c.executePaiement(p, 50);
        System.out.println();
        c.executePaiement(cc, 124);
    }
}
