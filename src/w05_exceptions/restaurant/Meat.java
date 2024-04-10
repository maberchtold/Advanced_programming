package w05_exceptions.restaurant;

public class Meat extends Animal implements Cookable{
    public Meat(String description, int weightInGrams) {
        super(description, weightInGrams);
    }

    @Override
    public int cook() {
        int retVal = 0;
        retVal = getWeightInGrams() / 10;
        return retVal;
    }
}
