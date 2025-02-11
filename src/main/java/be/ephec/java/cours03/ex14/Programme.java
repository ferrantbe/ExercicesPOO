package be.ephec.java.cours03.ex14;

import be.ephec.java.cours03.ex14.formes.Circle;
import be.ephec.java.cours03.ex14.formes.Square;
import be.ephec.java.cours03.ex14.formes.Triangle;

public class Programme {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(new Point(1, 1));
        shapes[1] = new Triangle(new Point(2, 0));
        shapes[2] = new Square(new Point(-1, 3));
        shapes[3] = new Triangle(new Point(-2, 4));
        shapes[4] = new Square(new Point(3, 3));

        System.out.println("Affichage des formes: ");
        for (Shape shape : shapes) {
            shape.affiche();
        }

        System.out.println();
        System.out.println("Effacement des formes: ");
        for (Shape shape : shapes) {
            shape.efface();
        }
    }
}
