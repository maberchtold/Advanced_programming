package pruefung;

public abstract class Trockenprodukte extends Lebensmittel{
    private double preisProStueck;

    public Trockenprodukte(String bezeichnung, double preisProStueck) {
        super(bezeichnung);
        this.preisProStueck = preisProStueck;
    }

    public double price(){
        return preisProStueck;
    }

    @Override
    public String toString() {
        return super.toString()+"Trockenprodukte{" +
                "preisProStueck=" + preisProStueck +
                '}';
    }
}
