
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Pyydetään käyttäjältä tiedoston nimi
        String tiedosto = lukija.nextLine();

        // Yritetään avata tiedosto ja lukea sen sisältö
        try {
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));

            // Luetaan tiedosto rivi kerrallaan
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi); // Tulostetaan rivi
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}