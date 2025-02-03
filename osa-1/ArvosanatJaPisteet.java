
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Anna pisteet [0-100]:");
        int pisteet = Integer.valueOf(lukija.nextLine());

        if (pisteet < 0) {
            System.out.println("mahdotonta!");
        } else if (pisteet <= 49) {
            System.out.println("hylätty");
        } else if (pisteet <= 59) {
            System.out.println("1");
        } else if (pisteet <= 69) {
            System.out.println("2");
        } else if (pisteet <= 79) {
            System.out.println("3");
        } else if (pisteet <= 89) {
            System.out.println("4");
        } else if (pisteet <= 100) {
            System.out.println("5");
        } else if (pisteet > 100) {
            System.out.println("uskomatonta!");
        }
    }
}
