package be.ephec.java.cours07.ex28;

public class Fiche {
    private String nom, telephone, adresse;

    public Fiche(String nom, String telephone, String adresse) {
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("[");
        sb.append(nom).append(" - T. ");
        sb.append(telephone).append(' ');
        sb.append(adresse).append(']');
        return sb.toString();
    }
}
