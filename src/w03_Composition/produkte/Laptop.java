package w03_Composition.produkte;

public class Laptop extends  ElectronicProduct{
    private double screenSize;
    private String operatingSystem;

    public Laptop(String name, double price, int quantity, String manufacturer, double screenSize, String operatingSystem) {
        super(name, price, quantity, manufacturer);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Den Laptop "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Bildschirmgrösse: "+screenSize);
        System.out.println("Betriebssystem: "+operatingSystem);
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
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
