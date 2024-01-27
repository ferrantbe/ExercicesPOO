package be.ephec.java.ex03;

import be.ephec.java.ex02.Personne;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personne p = new Personne();
        System.out.print("Quel est le nom de la personne? ");
        p.setNom(sc.nextLine());

        System.out.print("Quel est le prénom de la personne? ");
        p.setPrenom(sc.nextLine());

        System.out.print("Quel est l'année de naissance de la personne? ");
        p.setAnneDeNaissance(sc.nextInt());

        p.display();
        int i = 5;
        System.out.println(i);

        doSomething(i, p);

        p.display();
        System.out.println(i);
    }

    private static void doSomething (int i, Personne p) {
        // Notez la différence entre 

        System.out.println("Entrée dans la méthode");

        i = 7;
        p.setNom("Térieur");
        p.setPrenom("Alex");

        System.out.println("Sortie de la méthode");
    }
}
