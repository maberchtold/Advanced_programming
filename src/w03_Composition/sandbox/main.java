package w03_Composition.sandbox;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Berchtold", "Matteo");
        Person p2 = new Person(p1);

        System.out.println(p1);
        System.out.println(p2);
    }
}
