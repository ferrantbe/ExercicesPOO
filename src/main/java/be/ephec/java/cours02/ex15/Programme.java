package be.ephec.java.cours02.ex15;

import java.util.Random;

public class Programme {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++)
            animals[i] = random.nextInt(100) < 50 ? new Dog() : new Cat();

        for (Animal animal : animals)
            animal.makeNoise();
    }
}
