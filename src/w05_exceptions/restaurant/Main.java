package w05_exceptions.restaurant;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Fish("Hering", 200);
        Plant plant1 = new Vegetable("Gemüse", 100);

        Standardmenu standardmenu1 = new Standardmenu(animal1, plant1);

        Animal animal2 = new Egg("Eggs", 200);
        Plant plant2 = new Rice("Rice", 100);

        Standardmenu standardmenu2 = new Standardmenu(animal2, plant2);

        Animal animal3 = new Fish("Hering", 100);
        Plant plant3 = new Vegetable("Gemüse", 50);

        Kidsmenu kidsmenu3 = new Kidsmenu(animal3, plant3);
    }
}
