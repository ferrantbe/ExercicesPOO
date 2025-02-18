package be.ephec.java.cours03.ex16;

public class InfoCompte {
    String accountNumber;
    Movement[] bankMovements;
    int bankMovementCounter = 0;

    public InfoCompte(String accountNumber, int nbMovements) {
        this.bankMovements = new Movement[nbMovements];
        this.accountNumber = accountNumber;
    }

    public void addBankMovement(Movement bankMovement) {
        if (bankMovementCounter < bankMovements.length) {
            this.bankMovements[bankMovementCounter++] = bankMovement;
        } else System.out.println("Error - can't add new Movement.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Movement[] getBankMovements() {
        return bankMovements;
    }
}
