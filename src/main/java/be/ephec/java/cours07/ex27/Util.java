package be.ephec.java.cours07.ex27;

import java.util.*;

public class Util {

    public static List<Integer> produceRandomListOfIntegers(int n) {
        List<Integer> response = new ArrayList<>();
        Random randomizer = new Random();
        for (int i = 0; i < n; i++)
            response.add(randomizer.nextInt(1000));
        Collections.sort(response);
        return response;
    }

    public static Set<Integer> produceRandomSetOfIntegers(int n) {
        Set<Integer> response = new TreeSet<>();
        Random randomizer = new Random();
        for (int i = 0; i < n; i++)
            response.add(randomizer.nextInt(1000));
        return response;
    }


}
