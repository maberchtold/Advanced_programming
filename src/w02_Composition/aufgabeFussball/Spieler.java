package w02_Composition.aufgabeFussball;

public class Spieler {
    private String name;
    private String vorname;
    private int nr;

    private Position position;

    public Spieler(String name, String vorname, int nr) {
        this.name = name;
        this.vorname = vorname;
        setNr(nr);
    }

    public Spieler(String name, String vorname, int nr, Position position) {
        this.name = name;
        this.vorname = vorname;
        setNr(nr);
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getNr() {
        return nr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNr(int nr) {
        if (nr > 0 && nr <= 20) {
            this.nr = nr;
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nr=" + nr +
                ", position=" + position +
                '}';
    }
}
