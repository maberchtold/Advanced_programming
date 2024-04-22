package pruefung;

public abstract class Getraenke extends Lebensmittel{
    private double preisProStueck;

    public Getraenke(String bezeichnung, double preisProStueck) {
        super(bezeichnung);
        this.preisProStueck = preisProStueck;
    }

    public double price(){
        return preisProStueck;
    }

    @Override
    public String toString() {
        return super.toString()+"Getraenke{" +
                "preisProStueck=" + preisProStueck +
                '}';
    }
}
