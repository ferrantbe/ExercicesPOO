package be.ephec.java.exercice.e10;

public class BankData {
    AccountInfo[] accountInformations;


    public void createAccountInfo(int nrAccounts) {
        accountInformations = new AccountInfo[nrAccounts];
    }

    public void addAccountInfo(int i, AccountInfo accountInfo) {
        accountInformations[i] = accountInfo;
    }
}
