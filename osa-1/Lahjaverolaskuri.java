
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");
        int suuruus = Integer.valueOf(lukija.nextLine());

        double eka = (100 + (suuruus - 5000) * 0.08);
        double toka = (1700 + (suuruus - 25000) * 0.10);
        double kolmas = (4700 + (suuruus - 55000) * 0.12);
        double neljas = (22100 + (suuruus - 200000) * 0.15);
        double viides = (142100 + (suuruus - 1000000) * 0.17);

        if (suuruus <= 4999) {
            System.out.println("Ei veroa!");
        } else if (suuruus >= 5000 && suuruus <= 25000) {
            System.out.println("Vero: " + eka);
        } else if (suuruus >= 25001 && suuruus <= 55000) {
            System.out.println("Vero: " + toka);
        } else if (suuruus >= 55001 && suuruus <= 200000) {
            System.out.println("Vero: " + kolmas);
        } else if (suuruus >= 200001 && suuruus <= 1000000) {
            System.out.println("Vero: " + neljas);
        } else {
            System.out.println("Vero: " + viides);
        }
    }
}
