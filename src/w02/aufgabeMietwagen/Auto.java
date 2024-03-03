package w02.aufgabeMietwagen;

public class Auto {
    private String groessenklasse;
    private String autonummer;
    private boolean isVermietet = false;
    private int anzVermieteteTage;
    private double preisProTag;

    public Auto(String groessenklasse, String autonummer, int anzVermieteteTage, double preisProTag) {
        this.groessenklasse = groessenklasse;
        this.autonummer = autonummer;
        this.anzVermieteteTage = anzVermieteteTage;
        this.preisProTag = preisProTag;
    }

    public Auto(Auto auto) {
        this.groessenklasse = auto.groessenklasse;
        this.autonummer = auto.autonummer;
        this.isVermietet = auto.isVermietet;
        this.anzVermieteteTage = auto.anzVermieteteTage;
        this.preisProTag = auto.preisProTag;
    }

    public String getGroessenklasse() {
        return groessenklasse;
    }

    public String getAutonummer() {
        return autonummer;
    }

    public boolean isVermietet() {
        return isVermietet;
    }

    public int getAnzVermieteteTage() {
        return anzVermieteteTage;
    }

    public double getPreisProTag() {
        return preisProTag;
    }

    public void setGroessenklasse(String groessenklasse) {
        this.groessenklasse = groessenklasse;
    }

    public void setAutonummer(String autonummer) {
        this.autonummer = autonummer;
    }

    public void setVermietet(boolean vermietet) {
        isVermietet = vermietet;
    }

    public void setAnzVermieteteTage(int anzVermieteteTage) {
        this.anzVermieteteTage = anzVermieteteTage;
    }

    public void setPreisProTag(double preisProTag) {
        this.preisProTag = preisProTag;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "groessenklasse='" + groessenklasse + '\'' +
                ", autonummer='" + autonummer + '\'' +
                ", isVermietet=" + isVermietet +
                ", anzVermieteteTage=" + anzVermieteteTage +
                ", preisProTag=" + preisProTag +
                '}';
    }
}
