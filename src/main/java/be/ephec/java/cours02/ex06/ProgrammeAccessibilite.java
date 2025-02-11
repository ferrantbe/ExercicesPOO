package be.ephec.java.cours02.ex06;

import be.ephec.java.cours02.ex06.monPackage.MaSousClasse;
import be.ephec.java.cours02.ex06.monPackage.MonAutreClasse;
import be.ephec.java.cours02.ex06.autrePackage.AutreClasse;
import be.ephec.java.cours02.ex06.autrePackage.AutreSousClasse;
import be.ephec.java.cours02.ex06.monPackage.MaClasse;

public class ProgrammeAccessibilite {
    public static void main(String[] args) {
        MaClasse.main(args);
        MaSousClasse.main(args);
        MonAutreClasse.main(args);

        AutreClasse.main(args);
        AutreSousClasse.main(args);
    }
}
