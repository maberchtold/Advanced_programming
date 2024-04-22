package w04_Vererbung_polymorphismus_Schnittstellen.animals;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Fisch();
        animals[1] = new Tiger();
        animals[2] = new Albatross();

        animals[0].move();
        animals[1].move();
        animals[2].move();

        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
    }
}
