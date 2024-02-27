package w01.AufgabenArraysVonReferenzen_Bibliothek;

public class Buch {
    private String autor;
    private String titel;
    private int signatur;
    private boolean ausgeliehen = false;

    public Buch(String autor, String titel, int signatur) {
        this.autor = autor;
        this.titel = titel;
        this.signatur = signatur;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public int getSignatur() {
        return signatur;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setSignatur(int signatur) {
        this.signatur = signatur;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

    public String toString() {
        return "Buch{" +
                "autor='" + autor + '\'' +
                ", titel='" + titel + '\'' +
                ", signatur='" + signatur + '\'' +
                ", ausgeliehen=" + ausgeliehen +
                '}';
    }
}
