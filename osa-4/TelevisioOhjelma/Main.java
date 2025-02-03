
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            System.out.println("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());

            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));

        }

        System.out.println("Ohjelman maksimipituus? ");
        int maksimiPituus = Integer.valueOf(lukija.nextLine());

        for (TelevisioOhjelma TelevisioOhjelma : ohjelmat) {
            if (TelevisioOhjelma.getPituus() == maksimiPituus) {
                System.out.println(TelevisioOhjelma.getNimi() + ", " + TelevisioOhjelma.getPituus() + " minuuttia");
            }
        }
    }
}
