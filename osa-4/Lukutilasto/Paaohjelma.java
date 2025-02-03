
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parillisia = new Lukutilasto();
        Lukutilasto parittomia = new Lukutilasto();

        while (true) {
            System.out.println("Anna lukuja: ");
            int lukuja = Integer.parseInt(lukija.nextLine());

            if (lukuja == -1) {
                break;
            }

            tilasto.lisaaLuku(lukuja);

            if (lukuja % 2 == 0) {
                parillisia.lisaaLuku(lukuja);
            } else {
                parittomia.lisaaLuku(lukuja);
            }

        }

        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa " + parillisia.summa());
        System.out.println("Parittomien summa " + parittomia.summa());
    }
}
