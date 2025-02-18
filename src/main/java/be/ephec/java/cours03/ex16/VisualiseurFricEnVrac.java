package be.ephec.java.cours03.ex16;

import be.ephec.java.cours03.ex16.dataProvider.FricEnVracDataProvider;

public class VisualiseurFricEnVrac extends VisualiseurDeDonneesBancaires {
    @Override
    protected DonneeBanque recupereDonneesDeBanque() {
        // On récupère les données de la donnée FricEnVrac
        FricEnVracDataProvider provider = new FricEnVracDataProvider();
        String [][] data = provider.provideBankData();

        // On compte le nombre de comptes reçus
        int nrAccounts = 0;
        for (String[] line : data) {
            if (line.length == 1)
                nrAccounts++;
        }

        // On crée un objet BankData contenant un certain nombre d'AccountInfo
        DonneeBanque donneeBanque = new DonneeBanque();
        donneeBanque.createAccountInfo(nrAccounts);

        // On reparcourt le tableau de data reçu pour créer les objets AccountInfo
        int lineInData = 0;
        for (int i = 0; i < nrAccounts; i++) {
            // la première ligne contient le numéro de compte
            String accountNumber = data[lineInData][0];
            lineInData++;
            // Pour chaque compte, on en profite pour enregistrer l'index du premier
            // et du dernier mouvement de chaque compte dans data.
            int first = lineInData;

            int nrOfMovements = 0;
            // puis on parcourt data jusqu'à trouver le compte suivant ou arriver à la fin
            while (lineInData < data.length && data[lineInData].length != 1) {
                nrOfMovements++;
                lineInData++;
            }
            int last = lineInData - 1;
            InfoCompte accountInfo = new InfoCompte(accountNumber, nrOfMovements);
            for (int line = first; line <= last; line++) {
                int nrOfMovement = Integer.parseInt(data[line][0]);
                String fromAccount = data[line][1];
                double amount = Double.parseDouble(data[line][2]);
                String message = data[line][3];
                Movement movement = new Movement(nrOfMovement, fromAccount, amount, message);
                accountInfo.addBankMovement(movement);
            }
            donneeBanque.addAccountInfo(i, accountInfo);

        }

        return donneeBanque;
    }
}
