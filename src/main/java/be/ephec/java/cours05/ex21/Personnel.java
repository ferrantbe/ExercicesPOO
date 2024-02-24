package be.ephec.java.cours05.ex21;

import java.util.*;

public class Personnel {

    private List<Employe> employes = new ArrayList<Employe>();

    /*
    Définissez ensuite les méthodes suivantes à la classe Personnel :
    - void ajouterEmploye(Employe) qui ajoute un employé à la collection.
    - void afficherSalaires() qui affiche le salaire de chacun des employés de la collection.
    - double salaireMoyen() qui affiche le salaire moyen des employés de la collection.
     */

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void afficherSalaires() {
        for (Employe e : employes) {
            System.out.println(
                    e.getNom() + " gagne " + e.calculerSalaire() + " EUR");
        }
    }

    public double salaireMoyen() {
        double total = 0;
        for (Employe e : employes) {
            total += e.calculerSalaire();
        }
        return total / employes.size();
    }
}
