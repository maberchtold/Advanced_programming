package w03.produkte;

public class FoodProduct extends Product {
    private String expirationDate;
    private int weigthInGrams;

    public FoodProduct(String name, double price, int quantity, String expirationDate, int weigthInGrams) {
        super(name, "Food Product", price, quantity);
        this.expirationDate = expirationDate;
        this.weigthInGrams = weigthInGrams;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getWeigthInGrams() {
        return weigthInGrams;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setWeigthInGrams(int weigthInGrams) {
        this.weigthInGrams = weigthInGrams;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Food Produkt "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Ablaufdatum: "+expirationDate);
        System.out.println("Gewicht: "+weigthInGrams+"g");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", expirationDate='" + expirationDate + '\'' +
                ", weigthInGrams=" + weigthInGrams +
                '}';
    }
}
