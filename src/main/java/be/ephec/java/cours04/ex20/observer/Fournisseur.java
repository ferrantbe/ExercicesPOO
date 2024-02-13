package be.ephec.java.cours04.ex20.observer;

import java.util.HashSet;
import java.util.Set;

public class Fournisseur {
    Set<Subscriber> subscribers = new HashSet<>();

    public void addSubscriber(Subscriber client) {
        subscribers.add(client);
    }

    public void removeSubscriber(
            Subscriber client) {
        subscribers.remove(client);
    }

    private void informSubscribers() {
        System.out.println("Fournisseur - J'informe mes subscribers");
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void addProduct() {
        System.out.println("Fournisseur - Nouveau Produit est arrivé...");
        informSubscribers();
    }
}
