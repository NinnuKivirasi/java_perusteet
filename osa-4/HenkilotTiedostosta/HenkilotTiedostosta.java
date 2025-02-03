
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);

                Henkilo henkilo = new Henkilo(nimi, ika);
                henkilot.add(henkilo);
            }
        } catch (Exception e) {
            // Poikkeuksen käsittely, jos tiedoston lukeminen epäonnistuu
            System.out.println("Tiedoston lukeminen epäonnistui: " + e.getMessage());
        }
        // toteuta henkilöiden lukeminen ja luominen tänne
        return henkilot;
    }
}