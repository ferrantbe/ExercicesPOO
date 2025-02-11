package be.ephec.java.cours02.ex13b;

public record Student(String nom, int cote) {

    public boolean passe() {
        return cote >= 10;
    }
}
