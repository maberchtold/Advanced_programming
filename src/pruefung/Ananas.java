package pruefung;

public class Ananas extends Gemuese{
    private double preisProStueck;

    public Ananas(String bezeichnung, double preisProStueck) {
        super(bezeichnung);
        this.preisProStueck = preisProStueck;
    }

    public double price(){
        return preisProStueck;
    }
}
