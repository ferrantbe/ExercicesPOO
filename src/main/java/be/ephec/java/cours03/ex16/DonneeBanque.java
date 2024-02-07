package be.ephec.java.cours03.ex16;

public class DonneeBanque {
    InfoCompte[] infoComptes;


    public void createAccountInfo(int nbComptes) {
        infoComptes = new InfoCompte[nbComptes];
    }

    public void addAccountInfo(int i, InfoCompte infoCompte) {
        infoComptes[i] = infoCompte;
    }
}
