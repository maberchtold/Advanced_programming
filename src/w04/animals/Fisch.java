package w04.animals;

public class Fisch extends Animals{
    public Fisch() {
        super("Fisch");
    }

    public void move(){
        super.x += 2;
        super.anzahl++;
    }
}
