package w04_Vererbung_polymorphismus_Schnittstellen.animals;

public class Tiger extends Animals{
    public Tiger() {
        super("Tiger");
    }

    public void move(){
        super.x += 30;
        super.anzahl++;
    }
}
