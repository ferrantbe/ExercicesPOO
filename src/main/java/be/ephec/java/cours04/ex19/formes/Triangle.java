package be.ephec.java.cours04.ex19.formes;

import be.ephec.java.cours04.ex19.Point;
import be.ephec.java.cours04.ex19.Shape;

public class Triangle extends Shape {
    public Triangle(Point center) {
        super(center);
    }

    @Override
    public void affiche() {
        System.out.printf("Je suis un triangle centré en (%d, %d) et je m'affiche.\n", this.center.getX(), this.center.getY());
    }

    @Override
    public void efface() {
        System.out.printf("Je suis un triangle centré en (%d, %d) et je m'efface.\n", this.center.getX(), this.center.getY());
    }

    @Override
    public void rotate(int alpha) {
        System.out.printf("Je suis un triangle et je tourne d'un angle de %d°.%n", alpha);
    }
}
