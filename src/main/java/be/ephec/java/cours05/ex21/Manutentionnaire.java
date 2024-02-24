package be.ephec.java.cours05.ex21;

public class Manutentionnaire extends Employe{

    int nbHeuresTravail;
    public Manutentionnaire(String prenom, String nom, int age, String dateEntree, int nbHeuresTravail) {
        super(prenom, nom, age, dateEntree);
        this.nbHeuresTravail = nbHeuresTravail;
    }

    @Override
    public double calculerSalaire() {
        return 65 * nbHeuresTravail;
    }

    @Override
    public String getNom() {
        return "Manutentionnaire " + super.getNom();
    }
}
