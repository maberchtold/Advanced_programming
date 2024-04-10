package w05_exceptions.restaurant;

public abstract class Food {
    private String description;
    private int weightInGrams;

    public Food(String description, int weightInGrams) {
        this.description = description;
        this.weightInGrams = weightInGrams;
    }

    public String getDescription() {
        return description;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }
}
