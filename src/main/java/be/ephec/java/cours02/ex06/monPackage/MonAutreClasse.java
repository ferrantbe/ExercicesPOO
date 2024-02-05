package be.ephec.java.cours02.ex06.monPackage;

public class MonAutreClasse {
    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    public static void appelleMethodePublique(MaClasse o) {
        System.out.print("MonAutreClasse - appelleMethodePublique ");
        o.methodePublique();
    }
    public static void appelleMethodeProtected(MaClasse o) {
        System.out.print("MonAutreClasse - appelleMethodeProtected ");
        o.methodeProtected();
    }
    public static void appelleMethodeDefaut(MaClasse o) {
        System.out.print("MonAutreClasse - appelleMethodeDefaut ");
        o.methodeDefaut();
    }
    public static void appelleMethodePrivee(MaClasse o) {
        System.out.print("MonAutreClasse - appelleMethodePrivee ");
        System.out.println("!!!");
        // o.methodePrivee(); // Méthode non visible
    }
}
