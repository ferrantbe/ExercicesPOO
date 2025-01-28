package be.ephec.java.cours02.ex11;

public class FeuDeSignalisation {
    private CouleurDeFeu couleur = CouleurDeFeu.ORANGE;

    public CouleurDeFeu getCouleur() {
        return couleur;
    }

    public boolean isEstActif() {
        return estActif;
    }

    private boolean estActif = false;

    public void changeCouleur() {
        if (estActif)
            if (couleur == CouleurDeFeu.VERT) couleur = CouleurDeFeu.ORANGE;
            else if (couleur == CouleurDeFeu.ORANGE)
                couleur = CouleurDeFeu.ROUGE;
            else couleur = CouleurDeFeu.VERT;
    }

    public void active() {
        this.estActif = true;
        this.couleur = CouleurDeFeu.ROUGE;
    }

    public void desactive() {
        this.estActif = false;
        this.couleur = CouleurDeFeu.ORANGE;
    }

    public void affiche() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Le Feu est " + couleur;
    }
}
