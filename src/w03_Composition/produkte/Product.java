package w03_Composition.produkte;

public class Product {
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Product(String name, String type, double price, int quantity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void kaufen(){
        System.out.println("Sie haben das Produkt "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        System.out.println("====================\nProduktinfo "+getName()+"\n====================");
        System.out.println("Name: "+name);
        System.out.println("Typ: "+type);
        System.out.println("Preis: "+price);
        System.out.println("Menge: "+quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
