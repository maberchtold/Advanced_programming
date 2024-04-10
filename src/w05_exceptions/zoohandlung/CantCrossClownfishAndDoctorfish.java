package w05_exceptions.zoohandlung;

public class CantCrossClownfishAndDoctorfish extends RuntimeException{
    public CantCrossClownfishAndDoctorfish() {
        super("Clownfische und Doktorfische dürfen nicht zusammen verkauft werden");
    }

    public CantCrossClownfishAndDoctorfish(String message) {
        super(message);
    }
}
