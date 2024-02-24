package be.ephec.java.cours05.ex20.observer;

public class Prospect implements Subscriber {
    @Override
    public void update() {
        System.out.printf("Prospect - Est-ce que j'achèterais le produit?\n");
    }
}
