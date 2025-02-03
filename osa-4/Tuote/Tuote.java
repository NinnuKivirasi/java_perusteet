public class Tuote {
    private double hinta;
    private int lukumaara;
    private String nimi;

    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
        this.nimi = nimiAlussa;
    }

    public void tulostaTuote() {
        System.out.println(this.nimi + ", " + this.hinta + ", " + this.lukumaara + "kpl");
    }
}