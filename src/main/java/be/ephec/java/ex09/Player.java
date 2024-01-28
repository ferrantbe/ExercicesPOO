package be.ephec.java.ex09;

public class Player {
    private final String firstName;
    private int points;

    public Player(String firstName) {
        this.firstName = firstName;
    }

    public void addPoint() {
        this.points++;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPoints() {
        return points;
    }
}
