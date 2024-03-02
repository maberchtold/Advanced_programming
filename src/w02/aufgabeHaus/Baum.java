package w02.aufgabeHaus;

public class Baum {
    private String type;

    public Baum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Baum{" +
                "type='" + type + '\'' +
                '}';
    }
}
