
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        boolean loytyi = false;

        // Yritetään lukea tiedosto
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            System.out.println("Mitä etsitään?");
            String etsittava = lukija.nextLine();

            // Luetaan tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                // Mikäli rivi vastaa etsittävää, ilmoitetaan että se löytyi
                if (rivi.equals(etsittava)) {
                    System.out.println("Löytyi!");
                    loytyi = true;
                    break; // Lopetetaan, kun löytyi
                }
            }

            // Jos etsittävää ei löytynyt tiedostosta
            if (!loytyi) {
                System.out.println("Ei löytynyt.");
            }

        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + "lukeminen epäonnistui");
        }

        System.out.println("Kiitos!");
    }
}