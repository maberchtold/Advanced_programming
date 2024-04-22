package w03_Composition.unternehmen;

import java.util.Arrays;

public class Unternehmen {
    private String name;
    private Adresse adresse;
    private Tel tel;
    Arbeitnehmer[] arbeitnehmer;

    public Unternehmen(String name, Adresse adresse, Tel tel) {
        this.name = name;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Arbeitnehmer[] getArbeitnehmer() {
        return arbeitnehmer;
    }

    public void setArbeitnehmer(Arbeitnehmer[] arbeitnehmer) {
        this.arbeitnehmer = arbeitnehmer;
    }

    @Override
    public String toString() {
        return "Unternehmen{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                ", tel=" + tel +
                ", arbeitnehmer=" + Arrays.toString(arbeitnehmer) +
                '}';
    }
}
