package w02_Composition.aufgabeHaus;

import java.util.Arrays;

public class Haus {
    private Garten garten;
    private Fenster[] fenster;
    private Garage[] garagen;

    public Haus(Fenster[] fenster) {
        this.fenster = fenster;
    }

    public Haus(Fenster[] fenster, int gartenLaenge, int gartenBreite) {
        this.fenster = fenster;
        garten = new Garten(gartenLaenge, gartenBreite);
    }

    public Haus(Fenster[] fenster, int gartenLaenge, int gartenBreite, int anzGaragen) {
        this.fenster = fenster;
        garten = new Garten(gartenLaenge, gartenBreite);
        garagen = new Garage[anzGaragen];
        for (int i = 0; i < garagen.length; i++){
            garagen[i] = new Garage(i + 1);
        }
    }

    public boolean setAuto(int garagenNr, Auto auto){
        boolean retBool = false;
        if (garagenNr >= 1 && garagenNr <= garagen.length){
            garagen[garagenNr - 1].setAuto(auto);
        }
        return retBool;
    }

    public void pflanzeBaume(String[] arten){
        garten.setBaeume(arten);
    }

    public void hausBeschreibung(){
        System.out.println(Arrays.toString(fenster));
        System.out.println(garten.toString());
        System.out.println(Arrays.toString(garagen));
    }
}
