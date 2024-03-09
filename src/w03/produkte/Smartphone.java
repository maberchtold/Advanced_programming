package w03.produkte;

public class Smartphone extends ElectronicProduct {
    private double screenSize;
    private boolean runsAndroid;

    public Smartphone(String name, double price, int quantity, String manufacturer, double screenSize, boolean runsAndroid) {
        super(name, price, quantity, manufacturer);
        this.screenSize = screenSize;
        this.runsAndroid = runsAndroid;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public boolean isRunsAndroid() {
        return runsAndroid;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setRunsAndroid(boolean runsAndroid) {
        this.runsAndroid = runsAndroid;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Smartphone "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Bildschirmgrösse: "+screenSize);
        System.out.println("Läuft auf Android: "+runsAndroid);
    }

    public void switchToAndroid(){
        runsAndroid = true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", screenSize=" + screenSize +
                ", runsAndroid=" + runsAndroid +
                '}';
    }
}
