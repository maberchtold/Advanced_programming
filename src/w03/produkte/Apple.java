package w03.produkte;

public class Apple extends FoodProduct{
    private String colour;

    public Apple(String name, double price, int quantity, String expirationDate, int weigthInGrams, String colour) {
        super(name, price, quantity, expirationDate, weigthInGrams);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Apfel Produkt "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Farbe: "+colour);
    }

    public void addApple(){
        int currentQuantity = getQuantity();
        currentQuantity++;
        setQuantity(currentQuantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", expirationDate='" + getExpirationDate() + '\'' +
                ", weigthInGrams=" + getWeigthInGrams() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
