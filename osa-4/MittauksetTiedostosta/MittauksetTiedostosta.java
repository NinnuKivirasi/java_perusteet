
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();

        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());

        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        int lukumaara = 0;

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // Luetaan tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                int rivi = Integer.valueOf(tiedostonLukija.nextLine());

                if (rivi <= ylaraja && rivi >= alaraja) {
                    lukumaara++;
                }
            }
            System.out.println("Lukuja: " + lukumaara);

        } catch (Exception e) {

            System.out.println("Tiedoston lukeminen epäonnistui: " + e.getMessage());
        }

    }
}
