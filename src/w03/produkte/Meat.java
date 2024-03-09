package w03.produkte;

public class Meat extends FoodProduct {
    private String animal;

    public Meat(String name, double price, int quantity, String expirationDate, int weigthInGrams, String animal) {
        super(name, price, quantity, expirationDate, weigthInGrams);
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public void kaufen(){
        System.out.println("Sie haben das Fleisch "+getName()+" "+getQuantity()+" mal für "+(getQuantity()+getPrice())+" CHF gekauft");
    }

    public void info(){
        super.info();
        System.out.println("Tier: "+animal);
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
                ", animal='" + animal + '\'' +
                '}';
    }
}
