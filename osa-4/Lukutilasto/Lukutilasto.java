
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.lukujenMaara = 0;
        this.summa = 0;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.summa = this.summa + luku;
        this.lukujenMaara++;

    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return this.lukujenMaara;
    }

    public int summa() {
        // kertoo lisättyjen lukujen summan (tyhjän lukutilaston summa on 0)
        return this.summa;

    }

    public double keskiarvo() {
        // kertoo lisät;;tyjen lukujen keskiarvon (tyhjän lukutilaston keskiarvo on 0)
        if (this.lukujenMaara == 0) {
            return 0;
        }
        double keskiarvo = (double) this.summa / this.lukujenMaara;
        return keskiarvo;

    }

}