package be.ephec.java.ex06;

import be.ephec.java.ex06.autrePackage.AutreClasse;
import be.ephec.java.ex06.autrePackage.AutreSousClasse;
import be.ephec.java.ex06.monPackage.MaClasse;
import be.ephec.java.ex06.monPackage.MaSousClasse;
import be.ephec.java.ex06.monPackage.MonAutreClasse;

public class ProgrammeAccessibilite {
    public static void main(String[] args) {
        MaClasse.main(args);
        MaSousClasse.main(args);
        MonAutreClasse.main(args);

        AutreClasse.main(args);
        AutreSousClasse.main(args);
    }
}
