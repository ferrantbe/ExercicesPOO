package be.ephec.java.cours03.ex14.formes;

import be.ephec.java.cours03.ex14.Point;
import be.ephec.java.cours03.ex14.Shape;

public class Circle extends Shape {
    public Circle(Point center) {
        super(center);
    }

    @Override
    public void affiche() {
        System.out.printf("Je suis un cercle centré en (%d, %d) et je m'affiche.\n", this.center.getX(), this.center.getY());

    }

    @Override
    public void efface() {
        System.out.printf("Je suis un cercle centré en (%d, %d) et je m'efface.\n", this.center.getX(), this.center.getY());

    }
}
