package w04.bus;

public class Passagier {
    private static final int PRICE_CHILD = 10;
    private String name;
    private String vorname;
    private boolean isChild = true;
    private int payedPrice = 0;

    public Passagier(String name, String vorname, boolean isChild) {
        this.name = name;
        this.vorname = vorname;
        this.isChild = isChild;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getPayedPrice() {
        return payedPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void pay(){
        if (isChild){
            payedPrice = PRICE_CHILD;
        }else {
            payedPrice = PRICE_CHILD * 2;
        }
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}
