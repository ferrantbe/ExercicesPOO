package be.ephec.java.cours06.ex22;

public class Point {
    private int x, y;

    public Point(int x, int y) throws ConstructorException {
        if ((x < 0) || (y < 0)) throw new ConstructorException();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void deplace(int dx, int dy) throws MoveException {
        if (((x + dx) < 0) || ((y + dy) < 0)) throw new MoveException();
        x += dx;
        y += dy;
    }
}
