package pruefung;

public abstract class Lebensmittel {
    private String bezeichnung;

    public Lebensmittel(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double price(){
        return 0;
    }

    public String toString() {
        return "Lebensmittel{" +
                "bezeichnung='" + bezeichnung + '\'' +
                '}';
    }
}
