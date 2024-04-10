package w05_exceptions.restaurant;

public class Rice extends Plant implements Cookable{
    public Rice(String description, int weightInGrams) {
        super(description, weightInGrams);
    }

    @Override
    public int cook() {
        int retVal = 0;
        retVal = 30;
        return retVal;
    }
}
