
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class VieraslistaTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();

        // toteuta tiedoston lukeminen tässä.
        System.out.println("");
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");
        while (true) {
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            if (lista.contains(nimi)) {
                System.out.println("Nimi on listalla.");
            } else {
                System.out.println("Nimi ei ole listalla.");
            }
        }

        System.out.println("Kiitos!");
    }
}
