package be.ephec.java.cours05.ex21;

public class Vendeur extends Employe {

    private double chiffreDAffaires;

    public Vendeur(String prenom, String nom, int age, String dateEntree,
                   int chiffreDAffaires) {
        super(prenom, nom, age, dateEntree);
        this.chiffreDAffaires = chiffreDAffaires;
    }

    @Override
    public double calculerSalaire() {
        return 400 + .2 * this.chiffreDAffaires;
    }

  /*
    @Override
    public String getNom() {
        return "Vendeur " + super.getNom();
    }
    */
}
