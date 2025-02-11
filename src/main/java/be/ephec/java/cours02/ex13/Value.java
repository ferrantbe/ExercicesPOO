package be.ephec.java.cours02.ex13;

public enum Value {
    AS("As"), DEUX("2"), TROIS("3"), QUATRE("4"), CINQ("5"), SIX("6"), SEPT(
            "7"),
    HUIT("8"), NEUF("9"), DIX("10"), VALET("Valet"), DAME("Dame"), ROI("Roi");

    private final String number;

    Value(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
