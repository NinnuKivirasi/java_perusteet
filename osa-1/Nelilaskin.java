
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());

        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());

        int summa = eka + toka;

        int miinus = eka - toka;

        int kerto = eka * toka;

        double jako = 1.0 * eka / toka;

        System.out.println(eka + " + " + toka + " = " + summa);

        System.out.println(eka + " - " + toka + " = " + miinus);

        System.out.println(eka + " * " + toka + " = " + kerto);

        System.out.println(eka + " / " + toka + " = " + jako);
    }
}
