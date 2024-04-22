package pruefung;

public class Aepfel extends Gemuese implements Weighable{
    private int gewichtInKg;
    private double preisProKg;

    public Aepfel(String bezeichnung, int gewichtInKg, double preisProKg) {
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
        return super.toString()+"Aepfel{" +
                "gewichtInKg=" + gewichtInKg +
                ", preisProKg=" + preisProKg +
                '}';
    }
}
