package be.ephec.java.cours02.ex13;

public enum Color {
    PIQUE("Pique"), COEUR("Coeur"), CARREAU("Carreau"), TREFLE("Trèfle");

    private final String couleur;

    Color(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return couleur;
    }
}
