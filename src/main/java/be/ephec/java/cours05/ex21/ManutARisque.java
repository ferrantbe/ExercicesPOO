package be.ephec.java.cours05.ex21;

public class ManutARisque extends Manutentionnaire implements EmployeARisque {
    public ManutARisque(String prenom, String nom, int age, String dateEntree,
                        int nbHeuresTravail) {
        super(prenom, nom, age, dateEntree, nbHeuresTravail);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + EmployeARisque.primeDeRisque;
    }
}

