
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
            }
            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti
            int luku = Integer.valueOf(rivi);
            int kuutio = luku * luku * luku;
            System.out.println(kuutio);
        }

    }
}
