package be.ephec.java.cours02.ex06.autrePackage;


import be.ephec.java.cours02.ex06.monPackage.MaClasse;

public class AutreClasse {
    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    public static void appelleMethodePublique(MaClasse o) {
        System.out.print("AutreClasse - appelleMethodePublique ");
        o.methodePublique();
    }
    public static void appelleMethodeProtected(MaClasse o) {
        System.out.print("AutreClasse - appelleMethodeProtected ");
        System.out.println("!!!");
        // o.methodeProtected(); // Méthode non visible
    }
    public static void appelleMethodeDefaut(MaClasse o) {
        System.out.print("AutreClasse - appelleMethodeDefaut ");
        System.out.println("!!!");
        // o.methodeDefaut(); // Méthode non visible
    }
    public static void appelleMethodePrivee(MaClasse o) {
        System.out.print("AutreClasse - appelleMethodePrivee ");
        System.out.println("!!!");
        // o.methodePrivee(); // Méthode non visible
    }
}
