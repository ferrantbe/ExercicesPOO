package be.ephec.java.cours02.ex13b;

import java.util.Random;

public class Programme {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            students[i] = new Student("Student" + i, rnd.nextInt(20));
        }

        for (Student student: students) {
            System.out.println(student + (student.passe() ? " passe." : "ne passe pas."));
        }
    }
}
