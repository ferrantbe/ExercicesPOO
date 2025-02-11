package be.ephec.java.cours04.ex19;

import be.ephec.java.cours04.ex19.formes.Circle;
import be.ephec.java.cours04.ex19.formes.Square;
import be.ephec.java.cours04.ex19.formes.Triangle;

import java.util.Random;

public class Programme {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(new Point(1, 1));
        shapes[1] = new Triangle(new Point(2, 0));
        shapes[2] = new Square(new Point(-1, 3));

        System.out.println("Affichage des formes: ");
        for (Shape shape : shapes) {
            shape.affiche();
        }

        System.out.println();
        System.out.println("Rotation des formes: ");
        Random random = new Random();
        for (Shape shape : shapes) {
            shape.affiche();
            shape.rotate(random.nextInt(360));
            shape.affiche();
        }

        System.out.println();
        System.out.println("Translation des formes: ");
        for (Shape shape : shapes) {
            shape.affiche();
            shape.translate(random.nextInt(100) - 50, random.nextInt(100) - 50);
            shape.affiche();
        }


        System.out.println();
        System.out.println("Effacement des formes: ");
        for (Shape shape : shapes) {
            shape.efface();
        }
    }
}
