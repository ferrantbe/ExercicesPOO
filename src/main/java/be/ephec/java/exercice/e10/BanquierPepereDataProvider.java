package be.ephec.java.exercice.e10;

public class BanquierPepereDataProvider {
    /*
      La banque BanquierPepere donne les infos sous forme d'un tableau de tableaux de chaînes de caractères.
      Chaque ligne contient :
        - Le numéro de compte de la banque
        - Le numéro de compte de la contrepartie
        - Le montant
        - La communication
        - Le numéro du mouvement
     */
    public String[][] provideBankData() {

        String[][] data = {
                {"BE14 1840 4568 7182", "BE44 5566 7788 9900", "-4,75", "Folly Midi 15/01 12h02", "42"},
                {"BE14 1840 4568 7182", "BE54 1887 5954 6788", "-2,5", "Piscine De l'Eau 18/01 17h48", "43"},
                {"BE14 1840 4568 7182", "BE12 9844 2336 4499", "-40,45", "Pizza Bio 18/01 19h27", "44"},
                {"BE23 4238 7680 1111", "BE34 1234 1245 5672", "-2408,00", "PRONTO CANAPE 16/01 17h12", "12"},
                {"BE23 4238 7680 1111", "BE35 0257 4537 2587", "-2408,00", "PRONTO CANAPE 16/01 17h12", "12"},
        };
        return data;
    }

}
