package be.ephec.java.cours05.ex21;

public class TechnARisque extends Technicien implements EmployeARisque {
    public TechnARisque(String prenom, String nom, int age, String dateEntree,
                        int nbUunitesProduites) {
        super(prenom, nom, age, dateEntree, nbUunitesProduites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + EmployeARisque.primeDeRisque;
    }
}
