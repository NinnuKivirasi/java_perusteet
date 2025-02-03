
import java.nio.file.Paths;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String luettu = lukija.nextLine();

        int ottelut = 0;
        int voitot = 0;
        int tappiot = 0;

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                String[] palat = rivi.split(",");
                String kotijoukkue = palat[0];
                String vierasjoukkue = palat[1];
                int kotiPisteet = Integer.valueOf(palat[2]);
                int vierasPisteet = Integer.valueOf(palat[3]);

                if (kotijoukkue.equals(luettu)) {
                    ottelut++;

                    if (kotiPisteet > vierasPisteet) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                } else if (vierasjoukkue.equals(luettu)) {
                    ottelut++;
                    if (vierasPisteet > kotiPisteet) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                }

            }
        } catch (Exception e) {
            // Poikkeuksen käsittely, jos tiedoston lukeminen epäonnistuu
            System.out.println("Tiedoston lukeminen epäonnistui: " + e.getMessage());
        }
        System.out.println("Otteluita: " + ottelut);
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + tappiot);
    }
}