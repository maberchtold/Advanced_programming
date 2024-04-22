package pruefung;

public class Tomaten extends Gemuese implements Weighable, Delicate{
    private int gewichtInKg;
    private double preisProKg;

    public Tomaten(String bezeichnung, int gewichtInKg, double preisProKg) {
        super(bezeichnung);
        this.gewichtInKg = gewichtInKg;
        this.preisProKg = preisProKg;
    }

    @Override
    public double weight(int gewichtInKg) {
        return 0;
    }

    public double price(){
        return preisProKg*gewichtInKg;
    }

    @Override
    public String toString() {
        return super.toString()+"Tomaten{" +
                "gewichtInKg=" + gewichtInKg +
                ", preisProKg=" + preisProKg +
                '}';
    }
}
