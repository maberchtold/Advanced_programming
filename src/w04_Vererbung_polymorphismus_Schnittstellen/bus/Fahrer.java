package w04_Vererbung_polymorphismus_Schnittstellen.bus;

public class Fahrer extends Passagier{
    private int gehalt;
    private int berufserfahrung;

    public Fahrer(String name, String vorname, int gehalt, int berufserfahrung) {
        super(name, vorname, false);
        this.gehalt = gehalt;
        this.berufserfahrung = berufserfahrung;
    }

    public int getGehalt() {
        return gehalt;
    }

    public int getBerufserfahrung() {
        return berufserfahrung;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    public void setBerufserfahrung(int berufserfahrung) {
        this.berufserfahrung = berufserfahrung;
    }

    @Override
    public String toString() {
        return "Fahrer{" +
                "name='" + getName() + '\'' +
                ", vorname='" + getVorname() + '\'' +
                ", gehalt=" + gehalt +
                ", berufserfahrung=" + berufserfahrung +
                '}';
    }
}
