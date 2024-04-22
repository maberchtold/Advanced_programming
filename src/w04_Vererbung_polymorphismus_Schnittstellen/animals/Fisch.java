package w04_Vererbung_polymorphismus_Schnittstellen.animals;

public class Fisch extends Animals{
    public Fisch() {
        super("Fisch");
    }

    public void move(){
        super.x += 2;
        super.anzahl++;
    }
}
