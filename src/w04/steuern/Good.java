package w04.steuern;

public abstract class Good {
    private int price;
    private String name;

    public Good(String name, int price) {
        this.price = price;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPriceTTC();


}
