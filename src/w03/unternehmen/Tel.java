package w03.unternehmen;

public class Tel {
    private String kenziffer;
    private int vorwahl;
    private int nummer;

    public Tel(String kenziffer, int vorwahl, int nummer) {
        this.kenziffer = kenziffer;
        this.vorwahl = vorwahl;
        this.nummer = nummer;
    }

    public String getKenziffer() {
        return kenziffer;
    }

    public int getVorwahl() {
        return vorwahl;
    }

    public int getNummer() {
        return nummer;
    }

    public void setKenziffer(String kenziffer) {
        this.kenziffer = kenziffer;
    }

    public void setVorwahl(int vorwahl) {
        this.vorwahl = vorwahl;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return kenziffer + " " + vorwahl + " " + nummer;
    }
}
