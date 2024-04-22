package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.aufgabenReferenzenAlsAttribute_CD;

public class Interpret {
    private String lastname; // Nachname des Interpreten
    private String firstname; // Vorname des Interpreten
    private String groupname; // Name der Gruppe, zu der der Interpret gehört (falls zutreffend)

    // Konstruktor der Interpret-Klasse
    // lastname: Nachname des Interpreten
    // firstname: Vorname des Interpreten
    // groupname: Name der Gruppe, zu der der Interpret gehört (falls zutreffend)
    public Interpret(String lastname, String firstname, String groupname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.groupname = groupname;
    }

    // Gibt den Nachnamen des Interpreten zurück
    public String getLastname() {
        return lastname;
    }

    // Gibt den Vornamen des Interpreten zurück
    public String getFirstname() {
        return firstname;
    }

    // Gibt den Gruppennamen zurück, zu dem der Interpret gehört (falls zutreffend)
    public String getGroupname() {
        return groupname;
    }

    // Setzt den Nachnamen des Interpreten
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Setzt den Vornamen des Interpreten
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Setzt den Gruppennamen, zu dem der Interpret gehört (falls zutreffend)
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    // Gibt eine String-Repräsentation des Interpreten zurück (mit Nachnamen, Vornamen und Gruppennamen)
    public String toString() {
        return "Interpret{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }
}
