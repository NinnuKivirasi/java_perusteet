
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        try (Scanner tiedostonLukija = new Scanner(Paths.get("data.txt"))) {

            // luetaan tiedostoja kunnes kaikki rivit on luettu
            while (tiedostonLukija.hasNextLine()) {
                // luetaan yksi rivi
                String rivi = tiedostonLukija.nextLine();
                // tulostetaan luettu rivi
                System.out.println(rivi);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
