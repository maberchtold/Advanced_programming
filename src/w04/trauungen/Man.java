package w04.trauungen;

public class Man extends Person implements Marriable{
    Woman wife;

    public Man(String name) {
        super(name);
    }

    @Override
    public void marry(Marriable m) {
        if (wife == null) {
            wife = (Woman)m;
            m.marry(this);
        }
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + getName() + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
