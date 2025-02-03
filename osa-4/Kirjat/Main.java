
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirjat> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            System.out.println("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());

            System.out.println("Julkaisuvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirjat(nimi, sivuja, vuosi));

        }
        System.out.println("Mitä tulostetaan? ");
        String tulostetaan = lukija.nextLine();

        for (Kirjat Kirjat : kirjat) {
            if (tulostetaan.equals("kaikki")) {
                System.out.println(Kirjat.getNimi() + ", " + Kirjat.getSivuja() + " sivua, " + Kirjat.getVuosi());
            }
            if (tulostetaan.equals("nimi")) {
                System.out.println(Kirjat.getNimi());
            }

        }
    }
}