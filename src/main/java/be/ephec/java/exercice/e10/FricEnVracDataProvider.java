package be.ephec.java.exercice.e10;

public class FricEnVracDataProvider {
    /*
      La banque FricEnVrac donne les infos sous forme d'un tableau de tableaux de chaînes de caractères.
      La première ligne contient le numéro de compte.
      Les lignes suivantes contiennent, pour chaque mouvement:
      - le numéro du mouvement
      - le numéro de compte d'où est parti l'argent
      - le montant
      - la communication
     */
    public String[][] provideBankData() {
        String[][] data = {
                {"BE21 0432 5543 1443"},
                { "21", "BE44 5566 7788 9900", "-10.07", "Sandwich en folie 14/01 12h37"},
                { "22", "BE54 3210 5432 6788", "-45.12", "Delhaize Outsiplou 15/01 18h45"},
                { "23", "BE00 0122 6562 4499", "1783.27", "Prime Janvier 2023"},
                { "24", "BE97 3376 1219 3921", "-7.55", "Au bon pain 16/01 07h43"},
                {"BE22 1543 5543 1545"},
                { "14", "BE66 1884 9229 5155", "-43.07", "PneusAuto 17/01 15h44"},
                { "15", "BE71 9335 8231 7514", "-125.17", "Papayou 17/01 18h45"},
                { "16", "BE02 4388 1154 9118", "-22.50", "Cineldo 17/01 19h23"}
        };
        return data;
    }

}
