package be.ephec.java.cours03.ex14;

public abstract class Shape {
    protected Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public abstract void affiche();
    public abstract void efface();
}
