package w05_exceptions.restaurant;

public class Pasta extends Plant implements Cookable{
    public Pasta(String description, int weightInGrams) {
        super(description, weightInGrams);
    }

    @Override
    public int cook() {
        int retVal = 0;
        retVal = 8;
        return retVal;
    }
}
