package be.ephec.java.cours05.ex20.observer;

public class Magasin implements Subscriber {
    private String name;

    public Magasin(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.printf("Magasin (%s) - Enfin, je vais commander le produit\n",
                this.name);
    }

    public void jeMAbonne(Fournisseur fournisseur) {
        fournisseur.addSubscriber(this);
    }

    public void jeMeDesabonne(Fournisseur fournisseur) {

        fournisseur.removeSubscriber(this);
    }


}
