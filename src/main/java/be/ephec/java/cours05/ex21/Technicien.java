package be.ephec.java.cours05.ex21;

public class Technicien extends Employe{

    private int nbUnitesProduites;
    public Technicien(String prenom, String nom, int age, String dateEntree,
                      int nbUunitesProduites) {
        super(prenom, nom, age, dateEntree);
        this.nbUnitesProduites = nbUunitesProduites;
    }

    @Override
    public double calculerSalaire() {
        return 5 * nbUnitesProduites;
    }

    @Override
    public String getNom() {
        return "Technicien " + super.getNom();
    }
}
