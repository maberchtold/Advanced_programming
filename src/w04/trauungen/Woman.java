package w04.trauungen;

public class Woman extends Person implements Marriable{
    Man husband;

    public Woman(String name) {
        super(name);
    }

    @Override
    public void marry(Marriable m) {
        if (husband == null){
            husband = (Man)m;
            m.marry(this);
        }
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + getName() + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
