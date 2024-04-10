package w05_exceptions.zoohandlung;

public class CantCrossSuesswasserAndSalzwasser extends RuntimeException{
    public CantCrossSuesswasserAndSalzwasser() {
        super("Süsswasserfische können nicht mit Salzwasserfischen verkauft werden");
    }
    public CantCrossSuesswasserAndSalzwasser(String errorMessage) {
        super(errorMessage);
    }
}
