
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Anna ensimmäinen luku:");
        int eka = Integer.valueOf(lukija.nextLine());

        System.out.println("Anna toinen luku:");
        int toka = Integer.valueOf(lukija.nextLine());

        if (eka == toka) {
            System.out.println("Luvut ovat yhtä suuret!");
        } else if (eka > toka) {
            System.out.println("Suurempi luku:" + eka);
        } else if (eka < toka) {
            System.out.println("Suurempi luku:" + toka);
        }
    }
}
