package be.ephec.java.cours07.ex30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Programme {
    public static void main(String[] args) throws FileNotFoundException {
        String chemin = "/Users/ferrant/Downloads/LongTexte.txt";
        File fichier = new File(chemin);
        Scanner scanner = new Scanner(fichier);

        Map<String, Integer> mots = new HashMap<>();
        while (scanner.hasNext()) {
            String mot = scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            if (mots.containsKey(mot))
                mots.put(mot, mots.get(mot) + 1);
            else mots.put(mot, 1);
        }
        System.out.println("Non trié: ");
        System.out.println(mots);


        scanner = new Scanner(fichier);
        Map<String, Integer> motsTrie = new TreeMap<>();
        while (scanner.hasNext()) {
            String mot = scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            if (motsTrie.containsKey(mot))
                motsTrie.put(mot, motsTrie.get(mot) + 1);
            else motsTrie.put(mot, 1);
        }
        System.out.println("Trié: ");
        System.out.println(motsTrie);





    }
}
