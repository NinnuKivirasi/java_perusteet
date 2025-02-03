public class Kirjat {
    private String nimi;
    private int sivuja;
    private int vuosi;

    public Kirjat(String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivuja() {
        return sivuja;
    }

    public int getVuosi() {
        return vuosi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivuja + this.vuosi;
    }

}
