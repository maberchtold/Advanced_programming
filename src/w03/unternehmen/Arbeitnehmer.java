package w03.unternehmen;

import java.util.Arrays;

public class Arbeitnehmer {
    static private int arbeitnehmerCounter = 0;
    private String nachname;
    private String vorname;
    private Adresse adresse;
    private String[] emailAdressen;
    private Tel privatTel;
    private Tel natelTel;
    private int geschaeftlichDurchwahl;
    private String geburtsdatum;
    private String datumDipl;
    private String datumEinstellung;
    private int gehaltklasse;

    public Arbeitnehmer(String nachname, String vorname, Adresse adresse, String[] emailAdressen, Tel privatTel, Tel natelTel, String geburtsdatum, String datumDipl, String datumEinstellung, int gehaltklasse) {
        this.nachname = nachname;
        this.vorname = vorname;
        arbeitnehmerCounter++;
        this.adresse = adresse;
        this.emailAdressen = emailAdressen;
        this.privatTel = privatTel;
        this.natelTel = natelTel;
        this.geschaeftlichDurchwahl = arbeitnehmerCounter;
        this.geburtsdatum = geburtsdatum;
        this.datumDipl = datumDipl;
        this.datumEinstellung = datumEinstellung;
        this.gehaltklasse = gehaltklasse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String[] getEmailAdressen() {
        return emailAdressen;
    }

    public Tel getPrivatTel() {
        return privatTel;
    }

    public Tel getNatelTel() {
        return natelTel;
    }

    public int getGeschaeftlichDurchwahl() {
        return geschaeftlichDurchwahl;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getDatumDipl() {
        return datumDipl;
    }

    public String getDatumEinstellung() {
        return datumEinstellung;
    }

    public int getGehaltklasse() {
        return gehaltklasse;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setEmailAdressen(String[] emailAdressen) {
        this.emailAdressen = emailAdressen;
    }

    public void setPrivatTel(Tel privatTel) {
        this.privatTel = privatTel;
    }

    public void setNatelTel(Tel natelTel) {
        this.natelTel = natelTel;
    }

    public void setGeschaeftlichDurchwahl(int geschaeftlichDurchwahl) {
        this.geschaeftlichDurchwahl = geschaeftlichDurchwahl;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setDatumDipl(String datumDipl) {
        this.datumDipl = datumDipl;
    }

    public void setDatumEinstellung(String datumEinstellung) {
        this.datumEinstellung = datumEinstellung;
    }

    public void setGehaltklasse(int gehaltklasse) {
        this.gehaltklasse = gehaltklasse;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Arbeitnehmer{" +
                "nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                ", adresse=" + adresse +
                ", emailAdressen=" + Arrays.toString(emailAdressen) +
                ", privatTel=" + privatTel +
                ", natelTel=" + natelTel +
                ", geschaeftlichDurchwahl=" + geschaeftlichDurchwahl +
                ", geburtsdatum='" + geburtsdatum + '\'' +
                ", datumDipl='" + datumDipl + '\'' +
                ", datumEinstellung='" + datumEinstellung + '\'' +
                ", gehaltklasse=" + gehaltklasse +
                '}';
    }
}
