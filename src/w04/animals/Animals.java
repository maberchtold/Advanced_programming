package w04.animals;

abstract public class Animals {
    protected int anzahl;
    protected int x;
    protected int y;
    protected String typ;

    public Animals(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    abstract public void move();

    @Override
    public String toString() {
        return "Animals{" +
                "anzahl=" + anzahl +
                ", x=" + x +
                ", y=" + y +
                ", typ='" + typ + '\'' +
                '}';
    }
}
