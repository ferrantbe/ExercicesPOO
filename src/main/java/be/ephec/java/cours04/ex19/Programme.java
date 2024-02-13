package be.ephec.java.cours04.ex19;

import be.ephec.java.cours04.ex19.shapes.Circle;
import be.ephec.java.cours04.ex19.shapes.Shape;
import be.ephec.java.cours04.ex19.shapes.Square;
import be.ephec.java.cours04.ex19.shapes.Triangle;

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
        System.out.println("Transformations:");
        shapes[0].rotate(40);
        shapes[1].rotate(-60);
        shapes[2].rotate(10);
        shapes[3].translate(-5, 3);
        shapes[4].translate(8, 2);
        shapes[0].translate(-5, -2);

        System.out.println();
        System.out.println("Effacement des formes: ");
        for (Shape shape : shapes) {
            shape.efface();
        }

    }
}
