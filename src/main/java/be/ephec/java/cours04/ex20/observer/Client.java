package be.ephec.java.cours04.ex20.observer;

public class Client implements Subscriber {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.printf("Client (%s) - Enfin, je vais acheter le produit\n",
                this.name);
    }

    public void jeMAbonne(Fournisseur fournisseur) {
        fournisseur.addSubscriber(this);
    }

    public void jeMeDesabonne(Fournisseur fournisseur) {

        fournisseur.removeSubscriber(this);
    }


}
