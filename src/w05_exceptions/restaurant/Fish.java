package w05_exceptions.restaurant;

public class Fish extends Animal implements Cookable{
    public Fish(String description, int weightInGrams) {
        super(description, weightInGrams);
    }

    @Override
    public int cook() {
        int retVal = 0;
        retVal = getWeightInGrams() / 20;
        return retVal;
    }
}
