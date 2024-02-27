package w01.aufgabenReferenzenAlsAttribute_CD;

import java.util.Arrays;

public class CDController {
    public static void main(String[] args) {
        Interpret inter = new Interpret("Guschti", "Guschtaf", "TheGuschtis");
        CD cd = new CD("TheBestCD",inter, 5);

        cd.setTrackName("Testtrack1",0);
        cd.setTrackName("Testtrack2",1);
        cd.setTrackName("Testtrack3",2);
        cd.setTrackName("Testtrack4",3);
        cd.setTrackName("Testtrack5",4);

        cd.setTrackDuration(3,0);
        cd.setTrackDuration(2,1);
        cd.setTrackDuration(4,2);
        cd.setTrackDuration(4,3);
        cd.setTrackDuration(8,4);

        System.out.println(Arrays.toString(cd.getTrackNames()));
        System.out.println(cd);
        System.out.println(cd.currentTrack());
        cd.nextTrack();
        cd.nextTrack();
        cd.prevTrack();
        System.out.println(cd.currentTrack());
        System.out.println("Die gesamtdauer der CD beträgt: "+cd.gesamtDauer()+" min.");
    }
}
