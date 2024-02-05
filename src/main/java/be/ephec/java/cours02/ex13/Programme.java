package be.ephec.java.cours02.ex13;

public class Programme {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);
    }
}
