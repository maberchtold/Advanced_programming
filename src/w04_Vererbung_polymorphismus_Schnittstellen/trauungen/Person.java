package w04_Vererbung_polymorphismus_Schnittstellen.trauungen;

public abstract class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
