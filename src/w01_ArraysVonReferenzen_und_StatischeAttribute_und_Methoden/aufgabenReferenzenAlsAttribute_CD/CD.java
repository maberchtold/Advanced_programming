package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.aufgabenReferenzenAlsAttribute_CD;

import java.util.Arrays;

public class CD {
    private String cdTitle; // Titel der CD
    private String[] trackNames; // Namen der Tracks auf der CD
    private int[] trackDurations; // Dauer der Tracks auf der CD in Sekunden
    private Interpret interpret; // Interpret/Künstler der CD
    private int trackPointer = 0; // Zeiger auf den aktuellen Track

    // Konstruktor der CD-Klasse
    // cdTitle: Titel der CD
    // interpret: Interpret/Künstler der CD
    // trackCount: Anzahl der Tracks auf der CD
    public CD(String cdTitle, Interpret interpret, int trackCount) {
        this.cdTitle = cdTitle;
        this.interpret = interpret;

        trackNames = new String[trackCount]; // Initialisierung des Arrays für Tracknamen
        trackDurations = new int[trackCount]; // Initialisierung des Arrays für Trackdauern
    }

    // Gibt den Titel der CD zurück
    public String getCdTitle() {
        return cdTitle;
    }

    // Gibt den Namen des Tracks an einem bestimmten Index zurück
    // index: Der Index des Tracks
    // Rückgabe: Der Name des Tracks oder eine Fehlermeldung, falls der Index ungültig ist
    public String getTrackName(int index) {
        String retStr = "";
        if (index < 0 || index > trackNames.length - 1){
            retStr = "Der Song liegt ausserhalb des index";
        } else {
            retStr = trackNames[index];
        }
        return retStr;
    }

    // Gibt die Dauer des Tracks an einem bestimmten Index zurück
    // index: Der Index des Tracks
    // Rückgabe: Die Dauer des Tracks in Sekunden oder -1, falls der Index ungültig ist
    public int getTrackDuration(int index) {
        int retInt = -1;
        if (!(index < 0 || index > trackDurations.length - 1)){
            retInt = trackDurations[index];
        }
        return retInt;
    }

    // Gibt alle Tracknamen zurück
    public String[] getTrackNames() {
        return trackNames;
    }

    // Gibt alle Trackdauern zurück
    public int[] getTrackDurations() {
        return trackDurations;
    }

    // Gibt den Interpret/Künstler der CD zurück
    public String getInterpret() {
        return interpret.toString();
    }

    // Setzt den Titel der CD
    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    // Setzt den Namen eines Tracks an einem bestimmten Index
    // trackName: Der Name des Tracks
    // index: Der Index des Tracks
    public void setTrackName(String trackName, int index) {
        if (!(index < 0 || index > trackNames.length - 1)){
            trackNames[index] = trackName;
        }
    }

    // Setzt die Dauer eines Tracks an einem bestimmten Index
    // trackDuration: Die Dauer des Tracks in Sekunden
    // index: Der Index des Tracks
    public void setTrackDuration(int trackDuration, int index) {
        if (!(index < 0 || index > trackDurations.length - 1)){
            trackDurations[index] = trackDuration;
        }
    }

    // Setzt den Interpret/Künstler der CD
    public void setInterpret(Interpret interpret) {
        this.interpret = interpret;
    }

    // Gibt den Index des aktuellen Tracks zurück (basierend auf dem Zeiger)
    public int currentTrack(){
        return trackPointer + 1;
    }

    // Bewegt den Zeiger auf den nächsten Track (sofern möglich)
    public void nextTrack(){
        if (trackPointer != trackNames.length - 1){
            trackPointer++;
        }
    }

    // Bewegt den Zeiger auf den vorherigen Track (sofern möglich)
    public void prevTrack(){
        if (trackPointer != 0){
            trackPointer--;
        }
    }

    // Berechnet die Gesamtdauer aller Tracks auf der CD
    // Rückgabe: Die Gesamtdauer in Sekunden
    public int gesamtDauer(){
        int retInt = 0;
        for (int i = 0; i < trackDurations.length; i++){
            retInt += trackDurations[i];
        }
        return retInt;
    }

    // Gibt eine String-Repräsentation der CD zurück (mit Titel, Tracknamen, Trackdauern und Interpret)
    public String toString() {
        return "CD{" +
                "cdTitle='" + cdTitle + '\'' +
                ", trackNames=" + Arrays.toString(trackNames) +
                ", trackDurations=" + Arrays.toString(trackDurations) +
                ", interpret=" + interpret +
                '}';
    }
}

