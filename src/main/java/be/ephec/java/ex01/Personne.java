package be.ephec.java.ex01;

public class Personne {
    public String nom, prenom;
    public int anneDeNaissance;

    public int computeAge(int year) {
        return year - this.anneDeNaissance;
    }

    public void display() {
        System.out.printf("%s %s est né en %d et a %d ans.", this.nom, this.prenom,
                this.anneDeNaissance, this.computeAge(2024));
    }
}
