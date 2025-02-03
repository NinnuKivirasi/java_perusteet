public class Elokuva {
    private int ikaraja;
    private String nimi;

    public Elokuva(String elokuvanNimi, int elokuvanIkaraja) {
        this.ikaraja = elokuvanIkaraja;
        this.nimi = elokuvanNimi;
    }

    public String nimi() {
        return this.nimi;
    }

    public int ikaraja() {
        return this.ikaraja;
    }
}
