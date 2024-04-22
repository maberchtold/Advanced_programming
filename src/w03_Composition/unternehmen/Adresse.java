package w03_Composition.unternehmen;

public class Adresse {
    private String straasse;
    private String hausnummer;
    private int postleitzahl;
    private String ort;

    public Adresse(String straasse, String hausnummer, int postleitzahl, String ort) {
        this.straasse = straasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }

    public String getStraasse() {
        return straasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setStraasse(String straasse) {
        this.straasse = straasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "straasse='" + straasse + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", postleitzahl=" + postleitzahl +
                ", ort='" + ort + '\'' +
                '}';
    }
}
