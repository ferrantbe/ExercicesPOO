package be.ephec.java.cours02.ex13;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    Card[] cartes = new Card[52];

    public Deck() {
        int i = 0;
        for (Color col : Color.values())
            for (Value val : Value.values())
                this.cartes[i++] = new Card(col, val);
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < 52; i++) {
            int j;
            do {
                j = rnd.nextInt(52);
            } while (i == j);

            Card temp = cartes[i];
            cartes[i] = cartes[j];
            cartes[j] = temp;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(cartes) ;
    }
}
