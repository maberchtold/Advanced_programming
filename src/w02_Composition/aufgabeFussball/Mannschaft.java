package w02_Composition.aufgabeFussball;

import java.util.Arrays;

public class Mannschaft {
    private Spieler[] ms;
    private int pos = 0;

    public Mannschaft(int anzSpieler) {
        ms = new Spieler[anzSpieler];
    }

    public void setSpieler(Spieler spieler) {
        if (pos < ms.length){
            ms[pos] = spieler;
            pos++;
        }
    }

    public int getNrPosition(String p){
        int nr = -1;
        for (int i = 0; i < ms.length; i++){
            if (ms[i] != null && ms[i].getPosition().equals(p)){
                nr = i;
            }
        }
        return nr;
    }

    @Override
    public String toString() {
        return "Mannschaft{" +
                "ms=" + Arrays.toString(ms) +
                '}';
    }
}
