package pruefung;

public class Salat extends Gemuese implements Delicate{
    private double preisProStueck;

    public Salat(String bezeichnung, double preisProStueck) {
        super(bezeichnung);
        this.preisProStueck = preisProStueck;
    }

    public double price(){
        return preisProStueck;
    }
}
