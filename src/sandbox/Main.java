package sandbox;

public class Main {
    public static void main(String[] args) {
        TestParent object = new TestChild("myDescription", "childName");


        System.out.println(object.descritption);
    }
}
