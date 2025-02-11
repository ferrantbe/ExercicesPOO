package be.ephec.java.cours02.ex13;

public class Card {
    final Color color;
    final Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", value, color);
    }
}
