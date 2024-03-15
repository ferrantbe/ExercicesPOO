package be.ephec.java.cours07.ex27;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Combien de nombres voulez-vous (entre 1 et 1000)? ");
            n = sc.nextInt();
        } while(n <= 0 || n > 1000);
        System.out.println("List");
        List<Integer> list = Util.produceRandomListOfIntegers(n);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("Set");
        Set<Integer> set = Util.produceRandomSetOfIntegers(n);
        System.out.println(set);
        System.out.println(set.size());




    }
}
