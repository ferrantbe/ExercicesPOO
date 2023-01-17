package be.ephec.java.exercice.e01;

public class Person {
    public String lastName;
    public String firstName;
    public int yearOfBirth;
    public int age;

    public void computeAge(int year) {
        age = year - yearOfBirth;
    }

    public void display() {
        System.out.println(firstName + " " +
                lastName + " (" + age + " ans)");
    }
}

