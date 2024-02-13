package be.ephec.java.cours03.ex16;

import be.ephec.java.cours03.ex16.dataProvider.BanquierPepereDataProvider;
import be.ephec.java.cours03.ex16.dataProvider.FricEnVracDataProvider;

public class VisualiseurBanquierPepere extends VisualiseurDeDonneesBancaires {
    @Override
    protected DonneeBanque recupereDonneesDeBanque() {
        // On récupère les données de la donnée BanquierPepere
       BanquierPepereDataProvider provider = new BanquierPepereDataProvider();
       String [][] data = provider.provideBankData();

       /**
        {lin[Ø]: compte       , lin[1]: fromAccount, lin[2] amnt, lin[3] comm°       , lin[4] nrOfMvt},
        {"BE14 1840 4568 7182", "BE44 5566 7788 9900", "-4,75", "Folly Midi 15/01 12h02", "42"},
        {"BE14 1840 4568 7182", "BE54 1887 5954 6788", "-2,5", "Piscine De l'Eau 18/01 17h48", "43"},
        {"BE14 1840 4568 7182", "BE12 9844 2336 4499", "-40,45", "Pizza Bio 18/01 19h27", "44"},
        {"BE23 4238 7680 1111", "BE34 1234 1245 5672", "-2408,00", "PRONTO CANAPE 16/01 17h12", "12"},
        {"BE23 4238 7680 1111", "BE35 0257 4537 2587", "-2408,00", "PRONTO CANAPE 16/01 17h12", "12"},
        **/

        // On compte le nombre de comptes reçus
        int nrAccounts = 0;
        String prevAccount = data[0][0];
        // Parcourir les lignes, en vérifiant quand la première valeur change
        for (String [] ligne : data) {
            if(! ligne[0].equals(prevAccount))   {
                prevAccount = ligne[0];
                nrAccounts ++;
            }
        }

        // On crée un objet BankData contenant un certain nombre d'AccountInfo
        DonneeBanque donneeBanque = new DonneeBanque();
        donneeBanque.createAccountInfo(nrAccounts);

        // On reparcourt le tableau de data reçu pour créer les objets AccountInfo
        prevAccount = "";
        int nrOfMovements = 0;
//        // Parcourir les lignes, en vérifiant quand la première valeur change
//        for (String [] ligne : data) {
//            if(! ligne[0].equals(prevAccount))   {
//                prevAccount = ligne[0];
//            }
//            nrOfMovements++;
//
//        }
//        int lineInData = 0;
//        for (int i = 0; i < nrAccounts; i++) {
//            // la première ligne contient le numéro de compte
//            String accountNumber = data[lineInData][0];
//            lineInData++;
//            // Pour chaque compte, on en profite pour enregistrer l'index du premier
//            // et du dernier mouvement de chaque compte dans data.
//            int first = lineInData;
//
//            int nrOfMovements = 0;
//            // puis on parcourt data jusqu'à trouver le compte suivant ou arriver à la fin
//            while (lineInData < data.length && data[lineInData].length != 1) {
//                nrOfMovements++;
//                lineInData++;
//            }
//            int last = lineInData - 1;
//            InfoCompte accountInfo = new InfoCompte(accountNumber, nrOfMovements);
//            for (int line = first; line <= last; line++) {
//                int nrOfMovement = Integer.parseInt(data[line][0]);
//                String fromAccount = data[line][1];
//                double amount = Double.parseDouble(data[line][2]);
//                String message = data[line][3];
//                Movement movement = new Movement(nrOfMovement, fromAccount, amount, message);
//                accountInfo.addBankMovement(movement);
//            }
//            donneeBanque.addAccountInfo(i, accountInfo);
//
//        }

        return donneeBanque;
    }
}
