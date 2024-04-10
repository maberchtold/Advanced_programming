package w05_exceptions.zoohandlung;

public class CantCrossSkalarWithSuesswasser extends RuntimeException{
    public CantCrossSkalarWithSuesswasser() {
        super("Skalare dürfen nicht mit anderen Süsswasserfischen zusammen verkauft werden");
    }

    public CantCrossSkalarWithSuesswasser(String message) {
        super(message);
    }
}
