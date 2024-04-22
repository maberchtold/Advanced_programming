package w04_Vererbung_polymorphismus_Schnittstellen.steuern;

public abstract class Luxury extends Good{
    public Luxury(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPriceTTC() {
        return (int)(getPrice() + (getPrice() * 0.195));
    }
}
