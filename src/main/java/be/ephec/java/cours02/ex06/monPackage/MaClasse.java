package be.ephec.java.cours02.ex06.monPackage;

public class MaClasse {
    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }


    public void methodePublique(){
        System.out.println("MaClasse - Méthode publique");
    }
    protected void methodeProtected(){
        System.out.println("MaClasse - Méthode protected");
    }
    void methodeDefaut(){
        System.out.println("MaClasse - Méthode par défaut");
    }
    public void methodePrivee(){
        System.out.println("MaClasse - Méthode privée");
    }

    public static void appelleMethodePublique(MaClasse o) {
        System.out.print("MaClasse - appelleMethodePublique ");
        o.methodePublique();
    }
    public static void appelleMethodeProtected(MaClasse o) {
        System.out.print("MaClasse - appelleMethodeProtected ");
        o.methodeProtected();
    }
    public static void appelleMethodeDefaut(MaClasse o) {
        System.out.print("MaClasse - appelleMethodeDefaut ");
        o.methodeDefaut();
    }
    public static void appelleMethodePrivee(MaClasse o) {
        System.out.print("MaClasse - appelleMethodePrivee ");
        o.methodePrivee();
    }
}
