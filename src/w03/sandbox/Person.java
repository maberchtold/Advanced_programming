package w03.sandbox;

public class Person {
    static private String name = "";
    private String vorname = "";

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public Person(Person person) {
        this.name = person.name;
        this.vorname = person.vorname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}
