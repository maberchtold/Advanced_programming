package w02_Composition.aufgabeHaus;

public class Garage {
    private int nummer;
    private Auto auto;

    public Garage(int nummer) {
        this.nummer = nummer;
    }

    public Garage(int nummer, Auto auto) {
        this.nummer = nummer;
        this.auto = auto;
    }

    public int getNummer() {
        return nummer;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "nummer=" + nummer +
                ", auto=" + auto +
                '}';
    }
}
