package w05_exceptions.zoohandlung;

public abstract class Fisch {
    public Fisch() {
    }

    public void pruefen(Fisch fisch){
        if (this instanceof Suesswasser && fisch instanceof Salzwasser){
            throw new CantCrossSuesswasserAndSalzwasser();
        }

        if (this instanceof Salzwasser && fisch instanceof Suesswasser){
            throw new CantCrossSuesswasserAndSalzwasser();
        }

        if (this instanceof Clownfisch && fisch instanceof Doktorfisch){
            throw new CantCrossClownfishAndDoctorfish();
        }

        if (this instanceof Doktorfisch && fisch instanceof Clownfisch){
            throw new CantCrossClownfishAndDoctorfish();
        }

        if (this instanceof Skalar && fisch instanceof Suesswasser && !(fisch instanceof Skalar)){
            throw new CantCrossSkalarWithSuesswasser();
        }

        if (this instanceof Suesswasser && fisch instanceof Skalar && !(this instanceof Skalar)){
            throw new CantCrossSkalarWithSuesswasser();
        }
    };
}
