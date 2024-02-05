package be.ephec.java.cours02.ex11;

public class ProgrammeFeu {
    public static void main(String[] args) {
        FeuDeSignalisation feu = new FeuDeSignalisation();

        System.out.println(feu);
        feu.changeCouleur();
        System.out.println(feu);

        feu.active();
        System.out.println(feu);
        feu.changeCouleur();
        System.out.println(feu);
        feu.changeCouleur();
        System.out.println(feu);
        feu.changeCouleur();
        System.out.println(feu);
        feu.changeCouleur();
    }
}
