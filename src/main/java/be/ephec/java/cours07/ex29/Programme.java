package be.ephec.java.cours07.ex29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programme {
    public static void main(String[] args) throws FileNotFoundException {
        String chemin = "/Users/ferrant/Downloads/Lorem.txt";
        File fichier = new File(chemin);
        Scanner scanner = new Scanner(fichier);

        List<String> noms = new ArrayList<>();
        while (scanner.hasNext()) {
            noms.add(scanner.nextLine());
        }

        System.out.println("Non trié");
        System.out.println(noms);

        System.out.println();
        System.out.println("Trié");
        Collections.sort(noms);
        System.out.println(noms);


    }
}
