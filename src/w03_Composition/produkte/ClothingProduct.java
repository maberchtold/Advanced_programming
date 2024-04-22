package w03_Composition.produkte;

public class ClothingProduct extends Product {
    private String size;
    private String colour;

    public ClothingProduct(String name, double price, int quantity, String size, String colour) {
        super(name, "Clothing Product", price, quantity);
        this.size = size;
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Kleidungsstück "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Grösse: "+size);
        System.out.println("Farbe: "+colour);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
