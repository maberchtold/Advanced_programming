package w02.aufgabeHaus;

public class Main {
    public static void main(String[] args) {
        Fenster f1 = new Fenster(10,15,"grün");
        Fenster f2 = new Fenster(10,15,"grün");
        Fenster f3 = new Fenster(10,15,"grün");
        Fenster f4 = new Fenster(10,15,"grün");
        Fenster[] fensterArr = {f1,f2,f3,f4};

        Haus haus = new Haus(fensterArr,20,30,2);

        Auto a1 = new Auto("Mercedes", "rot");
        Auto a2 = new Auto("Audi", "weiss");
        haus.setAuto(1, a1);
        haus.setAuto(2, a2);

        String[] baumArr = {"Erle", "Eiche", "Fichte", "Ahorn"};
        haus.pflanzeBaume(baumArr);

        haus.hausBeschreibung();
    }
}
