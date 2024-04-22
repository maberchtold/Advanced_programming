package pruefung;

public class Tasche {
    private Lebensmittel[] lebensmittelArr = new Lebensmittel[5];

    private Lebensmittel prevLebensmittel = null;

    private int counter = 0;
    private int gewicht = 0;

    public Tasche() {
    }

    public void pack(Lebensmittel lebensmittel, int gewichtInKg){
        if (gewichtInKg + gewicht > 3){
            throw new TooHeavyException();
        } else if (counter == 5) {
            throw new BagFullException();
        } else if (prevLebensmittel instanceof Delicate) {
            throw new DelicateProductException();
        }else {
            lebensmittelArr[counter] = lebensmittel;
            counter++;
        }
    }

    public void pay(){
        double priceSum = 0;
        for (int i=0; i < lebensmittelArr.length; i++){
            priceSum+=lebensmittelArr[i].price();
        }

        System.out.println("Für die Tasche muss "+priceSum+" bezahlt werden.");
    }
}
