package be.ephec.java.cours05.ex21;

import java.time.LocalDate;

public abstract class Employe {
    /*
    Un employé est caractérisé par son nom, son prénom, son âge et sa date d'entrée en service dans l'entreprise.

    Ecrivez une classe abstraite Employe dotée des attributs nécessaires, d'une méthode abstraite calculerSalaire
    (ce calcul dépendra en effet du type de l'employé) et d'une méthode getNom retournant une chaine de caractère
    obtenue en concaténant la chaine de caractères "L'employé " avec le prénom et le nom.

    Dotez également votre classe d'un constructeur prenant en paramètre l'ensemble des attributs nécessaires
     */

    private String nom, prenom;
    private int age;
    private LocalDate dateEntree;

    public Employe(String prenom, String nom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = LocalDate.of(Integer.parseInt(dateEntree), 1, 1);
    }

    public abstract double calculerSalaire();
    public String getNom(){
        String np =  new StringBuilder(this.prenom).append(" ").append(nom).toString();
        String classe = this.getClass().getSimpleName();
        return classe + " " + np;
    }
}
