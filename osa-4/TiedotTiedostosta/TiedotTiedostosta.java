
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);

                if (ika == 1) {
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                } else if (ika != 1) {
                    System.out.println(nimi + ", ikä: " + ika + " vuotta");
                }
            }

        } catch (Exception e) {
            // Poikkeuksen käsittely, jos tiedoston lukeminen epäonnistuu
            System.out.println("Tiedoston lukeminen epäonnistui: " + e.getMessage());
        }
    }
}