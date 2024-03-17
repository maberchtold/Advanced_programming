package w04.trauungen;

public class Teenager extends Person{
    public Teenager(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Teenager{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
