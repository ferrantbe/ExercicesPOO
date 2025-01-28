package be.ephec.java.cours01.ex04;

import java.util.Scanner;


public class Base {

    private static int base;
    private static int nombre;

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est la base? ");
        base = scanner.nextInt();

        System.out.printf("Valeur en base %d: ", base);

        if (scanner.hasNextInt(base)) {
            nombre = scanner.nextInt(base);

            System.out.println();

            System.out.printf("En base 10, ça donne %d.", nombre);
        }
        scanner.close();
    }


} 