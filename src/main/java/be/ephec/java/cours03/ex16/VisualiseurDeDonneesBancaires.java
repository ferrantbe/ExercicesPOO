package be.ephec.java.cours03.ex16;

public abstract class VisualiseurDeDonneesBancaires {
    protected abstract DonneeBanque recupereDonneesDeBanque();
    public String formaterDonnees() { // logique pour formatter le rapport
        DonneeBanque data = recupereDonneesDeBanque();
        StringBuilder sb = new StringBuilder();

        for (InfoCompte ai : data.infoComptes) {
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