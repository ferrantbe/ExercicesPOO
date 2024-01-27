package be.ephec.java.ex02;

public class Personne {
    private String nom, prenom;
    private int anneDeNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneDeNaissance() {
        return anneDeNaissance;
    }

    public void setAnneDeNaissance(int anneDeNaissance) {
        this.anneDeNaissance = anneDeNaissance;
    }

    public int computeAge(int year) {
        return year - this.anneDeNaissance;
    }

    public void display() {
        System.out.printf("%s %s est né en %d et a %d ans.", this.nom, this.prenom,
                this.anneDeNaissance, this.computeAge(2024));
    }
}
