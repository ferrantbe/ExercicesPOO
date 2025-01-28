package be.ephec.java.cours02.ex05;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgrammeDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("En quelle année êtes-vous né? ");
        int annee = sc.nextInt();
        System.out.print("Quel mois êtes-vous né? ");
        int mois = sc.nextInt();
        System.out.print("Quel jour êtes-vous né? ");
        int jour = sc.nextInt();

        LocalDate naissance = LocalDate.of(annee, mois, jour);
        LocalDate maintenant = LocalDate.now();

        System.out.printf("Vous êtes né depuis %d années\n",
                ChronoUnit.YEARS.between(naissance, maintenant));
        System.out.printf("Vous êtes né depuis %d mois\n",
                ChronoUnit.MONTHS.between(naissance, maintenant));
        System.out.printf("Vous êtes né depuis %d semaines\n",
                ChronoUnit.WEEKS.between(naissance, maintenant));

        long days = ChronoUnit.DAYS.between(naissance, maintenant);
        System.out.printf("Vous êtes né depuis %d jours\n",
                days);

        long seconds = days * 24 * 60 * 60;
        System.out.printf("Vous êtes né depuis %d secondes\n",
                seconds);

    }
}
