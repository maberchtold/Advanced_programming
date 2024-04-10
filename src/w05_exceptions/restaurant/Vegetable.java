package w05_exceptions.restaurant;

public class Vegetable extends Plant implements Cookable{
    public Vegetable(String description, int weightInGrams) {
        super(description, weightInGrams);
    }

    @Override
    public int cook() {
        int retVal = 0;
        retVal = getWeightInGrams() / 15;
        return retVal;
    }
}
