package be.ephec.java.cours03.ex17;

import java.awt.font.MultipleMaster;

public class Programme {
    public static void main(String[] args) {
        Addition add = new Addition();
        Multiplication mul = new Multiplication();

        System.out.printf("%d + %d = %d\n", 3, 7, effectueCalcul(3, 7, add));
        System.out.printf("%d * %d = %d\n", 4, 9, effectueCalcul(4, 9, mul));
        System.out.printf("%d * %d = %d\n", 13, 18, effectueCalcul(13, 18, mul));



    }

    public static int effectueCalcul(int a, int b, Calculateur calculateur) {
        return calculateur.calcule(a, b);
    }








}
