package w13_Listen.selbstreferenzierendeKlassen;

public class Knoten {
    private int data;
    private Knoten next;

    public Knoten(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Knoten getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }

}
