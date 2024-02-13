package be.ephec.java.cours04.ex19.shapes;

import be.ephec.java.cours04.ex19.Point;
import be.ephec.java.cours04.ex19.Rotatable;
import be.ephec.java.cours04.ex19.Translatable;

public abstract class Shape implements Translatable, Rotatable {
    protected Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public abstract void affiche();
    public abstract void efface();

    @Override
    public void translate(int dx, int dy) {
        System.out.printf("Je suis un %s et je le déplace de (%d, %d) degrés.\n", this.getClass().getSimpleName(), dx, dy);
        this.center.setX(this.center.getX() + dx);
    }
}
