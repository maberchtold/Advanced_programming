package w03.produkte;

public class ProductTest {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("test", 2.2, 1, "apple", 20.2, "Windows");
        System.out.println(laptop);
        laptop.info();
        laptop.kaufen();
        System.out.println();

        Smartphone smartphone = new Smartphone("Iphhone 2", 1200, 1, "apple", 20.2, false);
        System.out.println(smartphone);
        smartphone.switchToAndroid();
        smartphone.info();
        smartphone.kaufen();
        System.out.println();

        Meat meat = new Meat("Chicken Wings", 23, 3, "13.03.2024", 400, "Chicken");
        System.out.println(meat);
        meat.info();
        meat.kaufen();
        System.out.println();

        Apple apple = new Apple("Green Apple", 5, 5, "09.05.2024", 200, "green");
        System.out.println(apple);
        apple.addApple();
        apple.info();
        apple.kaufen();
        System.out.println();

        ClothingProduct pants = new ClothingProduct("Jeans", 40, 2, "XL", "blue");
        System.out.println(pants);
        pants.info();
        pants.kaufen();
        System.out.println();
    }
}
