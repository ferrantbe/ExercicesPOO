package be.ephec.java.cours03.ex16;

public class Movement {
    final int nrOfMovement;
    final String fromAccount;
    final double amount;
    final String communication;

    public Movement(int nrOfMovement, String fromAccount, double amount, String message) {
        this.nrOfMovement = nrOfMovement;
        this.fromAccount = fromAccount;
        this.amount = amount;
        this.communication = message;
    }
}
