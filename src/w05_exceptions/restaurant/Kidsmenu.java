package w05_exceptions.restaurant;

public class Kidsmenu {
    private static int menuCounter = 1;
    private Animal animal;
    private Plant plant;
    private int cookingTime;

    public Kidsmenu(Animal animal, Plant plant) {
        this.animal = animal;
        this.plant = plant;


        System.out.println("Composing kidsmenu "+menuCounter+":");

        if (animal.getWeightInGrams() <= 100){
            if (animal instanceof Cookable){
                System.out.println(animal.getDescription() + " ("+animal.getWeightInGrams()+" g.) cooking for "+ ((Cookable) animal).cook() + " min.");
            }else {
                System.out.println(animal.getDescription() + " ("+animal.getWeightInGrams()+" g.) not cooked");
            }
        }else {
            System.out.println("To much "+ animal.getDescription() +".");
        }

        if (plant.getWeightInGrams() <= 50){
            if (plant instanceof Cookable){
                System.out.println(plant.getDescription() + " ("+plant.getWeightInGrams()+" g.) cooking for "+ ((Cookable) plant).cook() + " min.");
            }
        }else {
            System.out.println("To much "+ plant.getDescription() +".");
        }

        if (animal instanceof Cookable && plant instanceof Cookable){
            if (((Cookable) animal).cook() > ((Cookable) plant).cook()){
                cookingTime = ((Cookable) animal).cook();
            }else {
                cookingTime = ((Cookable) plant).cook();
            }
        }else {
            cookingTime = ((Cookable) plant).cook();
        }

        System.out.println("kidsmenu "+menuCounter+" has cooked in " + cookingTime);

        System.out.println();
        menuCounter++;
    }
}
