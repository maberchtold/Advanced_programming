package pruefung;

public abstract class Fleisch extends Lebensmittel implements Weighable{
    private int gewichtInKg;
    private double preisProKg;

    public Fleisch(String bezeichnung, int gewichtInKg, double preisProKg) {
        super(bezeichnung);
        this.gewichtInKg = gewichtInKg;
        this.preisProKg = preisProKg;
    }

    @Override
    public double weight(int gewichtInGramm) {
        return 0;
    }

    public double price(){
        return preisProKg*gewichtInKg;
    }

    @Override
    public String toString() {
        return super.toString()+"Fleisch{" +
                "gewichtInKg=" + gewichtInKg +
                ", preisProKg=" + preisProKg +
                '}';
    }
}
