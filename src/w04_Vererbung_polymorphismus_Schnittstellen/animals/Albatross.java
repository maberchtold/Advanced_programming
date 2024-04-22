package w04_Vererbung_polymorphismus_Schnittstellen.animals;

public class Albatross extends Animals{
    public Albatross() {
        super("Albatross");
    }


    public void move(){
        super.x += 200;
        super.anzahl++;
    }
}
