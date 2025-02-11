package be.ephec.java.cours04.ex18;

public class Programme {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        CarteDeCredit carte = new CarteDeCredit();

        Client client = new Client();

        client.executePaiement(paypal, 50);
        client.executePaiement(carte, 270);
    }
}
