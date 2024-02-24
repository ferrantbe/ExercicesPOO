package be.ephec.java.cours05.ex21;

public class Representant extends Employe{

    private double chiffreDAffaires;
    public Representant(String prenom, String nom, int age, String dateEntree,
                        int chiffreDAffaires) {
        super(prenom, nom, age, dateEntree);
        this.chiffreDAffaires = chiffreDAffaires;
    }

    @Override
    public double calculerSalaire() {
        return 800 + .2 * this.chiffreDAffaires;
    }

    @Override
    public String getNom() {
        return "Representant " + super.getNom();
    }
}
