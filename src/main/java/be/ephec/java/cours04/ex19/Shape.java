package be.ephec.java.cours04.ex19;

import be.ephec.java.cours04.ex19.interfaces.Rotatable;
import be.ephec.java.cours04.ex19.interfaces.Translatable;

public abstract class Shape implements Rotatable, Translatable {
    protected Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public abstract void affiche();
    public abstract void efface();

    public void translate(int dx, int dy) {
        int oldX = center.getX();
        int oldY = center.getY();
        int newX = oldX + dx;
        int newY = oldY + dy;

        center.setX(newX);
        center.setY(newY);
        System.out.printf("Je me déplace de (%d, %d) par rapport à (%d, %d).\n", dx, dy, oldX, oldY);
    }
}
