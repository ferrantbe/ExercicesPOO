package be.ephec.java.ex02;

public class Main {
    public static void main(String[] args) {

        int annee;
        if (args.length > 0)
            annee = Integer.parseInt(args[0]);
        else
            annee = 1983;

        Personne jules = new Personne();
        jules.setNom("Desmet");
        jules.setPrenom("Jules"); ;
        jules.setAnneDeNaissance(annee);
        System.out.println("Exercice 2");
        jules.display();
    }

}