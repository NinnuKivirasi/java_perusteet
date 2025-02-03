
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukumaara = 0;

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
            }
            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti
            lukumaara++;
        }
        System.out.println(lukumaara);
    }
}