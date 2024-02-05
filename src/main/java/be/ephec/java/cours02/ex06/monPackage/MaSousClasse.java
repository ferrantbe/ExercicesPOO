package be.ephec.java.cours02.ex06.monPackage;

public class MaSousClasse extends MaClasse {
    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    public static void appelleMethodePublique(MaClasse o) {
        System.out.print("MaSousClasse - appelleMethodePublique ");
        o.methodePublique();
    }
    public static void appelleMethodeProtected(MaClasse o) {
        System.out.print("MaSousClasse - appelleMethodeProtected ");
        o.methodeProtected();
    }
    public static void appelleMethodeDefaut(MaClasse o) {
        System.out.print("MaSousClasse - appelleMethodeDefaut ");
        o.methodeDefaut();
    }
    public static void appelleMethodePrivee(MaClasse o) {
        System.out.print("MaSousClasse - appelleMethodePrivee ");
        System.out.println("!!!");
        // o.methodePrivee(); // Méthode non visible
    }
}
