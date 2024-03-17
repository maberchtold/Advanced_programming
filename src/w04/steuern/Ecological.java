package w04.steuern;

public abstract class Ecological extends Good{
    public Ecological(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPriceTTC() {
        return (int)(getPrice() + (getPrice() * 0.03) + 5);
    }
}
