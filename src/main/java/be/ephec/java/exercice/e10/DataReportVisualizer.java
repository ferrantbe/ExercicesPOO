package be.ephec.java.exercice.e10;

public abstract class DataReportVisualizer {
    protected abstract BankData retrieveBankData();
    public String formatData() { // logique pour formatter le rapport
        BankData data = retrieveBankData();
        StringBuilder sb = new StringBuilder();

        for (AccountInfo ai : data.accountInformations) {
            sb.append("Nr: ");
            sb.append(ai.accountNumber);
            sb.append('\n');
            sb.append('\n');
            sb.append("Movements\n");
            sb.append("---------\n");
            for (Movement movement : ai.bankMovements) {
                sb.append(movement.nrOfMovement);
                sb.append('\t');
                sb.append(movement.fromAccount);
                sb.append('\t');
                sb.append(movement.amount);
                sb.append('\t');
                sb.append(movement.communication);
                sb.append('\n');
            }
            sb.append("*************\n");
            sb.append('\n');
        }
        return sb.toString();
    }
}