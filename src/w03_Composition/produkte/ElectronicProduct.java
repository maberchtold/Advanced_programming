package w03_Composition.produkte;

public class ElectronicProduct extends Product {
    private String manufacturer;

    public ElectronicProduct(String name, double price, int quantity, String manufacturer) {
        super(name, "Electronic Product", price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public void kaufen(){
        System.out.println("Sie haben das Elektronische Produkt "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Hersteller: "+manufacturer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
