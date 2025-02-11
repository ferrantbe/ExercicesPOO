package be.ephec.java.cours02.ex06.autrePackage;

import be.ephec.java.cours02.ex06.monPackage.MaClasse;

public class AutreSousClasse extends MaClasse {

    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        AutreSousClasse asc = new AutreSousClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        asc.appelleProtectedHeritage(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    public static void appelleMethodePublique(MaClasse o) {
        System.out.print("AutreSousClasse - appelleMethodePublique ");
        o.methodePublique();
    }
    public static void appelleMethodeProtected(MaClasse o) {
        System.out.print("AutreSousClasse - appelleMethodeProtected ");
        System.out.println("!!!");
        // o.methodeProtected(); // Méthode non visible
    }
    public static void appelleMethodeDefaut(MaClasse o) {
        System.out.print("AutreSousClasse - appelleMethodeDefaut ");
        System.out.println("!!!");
        // o.methodeDefaut(); // Méthode non visible
    }
    public static void appelleMethodePrivee(MaClasse o) {
        System.out.print("AutreSousClasse - appelleMethodePrivee ");
        System.out.println("!!!");
        // o.methodePrivee(); // Méthode non visible
    }

    public void appelleProtectedHeritage(MaClasse o) {
        System.out.print("AutreSousClasse - appelleProtectedHeritage (super) ");
        super.methodeProtected(); // possible dans le cadre de l'héritage
    }
}
