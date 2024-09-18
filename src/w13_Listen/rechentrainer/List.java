package w13_Listen.rechentrainer;

public class List {
    private Knoten first;
    private Knoten last;
    private Knoten removeItem;

    public List() {
        first = null;
        last = null;
        removeItem = null;
    }

    public void addAtEnd(int nr1, int nr2, char operator, int result) {
        Knoten knoten = new Knoten(nr1, nr2, operator, result);
        if (first == null && last == null) {
            first = knoten;
            last = knoten;
        }else{
            last.setNext(knoten);
            last = knoten;
        }
    }

    public void addAtBeginning(int nr1, int nr2, char operator, int result) {
        Knoten knoten = new Knoten(nr1, nr2, operator, result);
        if (first == null && last == null) {
            first = knoten;
            last = knoten;
        }else{
            knoten.setNext(first);
            first = knoten;
        }
    }

    public void addAtIndex(int nr1, int nr2, char operator, int result, int index) {
        Knoten knoten = new Knoten(nr1, nr2, operator, result);

        if (index == 0) {
            addAtBeginning(nr1, nr2, operator, result);
            return;
        }

        Knoten k = first;
        for (int i = 0; i < index - 1 && k != null; i++) {
            k = k.getNext();
        }

        if (k == null || k == last) {
            addAtEnd(nr1, nr2, operator, result);
        } else {
            knoten.setNext(k.getNext());
            k.setNext(knoten);
        }
    }

    public Knoten removeAtIndex(int index) {
        if (index == 0) {
            return removeAtBeginning();
        }

        Knoten k = first;
        for (int i = 0; i < index - 1 && k != null; i++) {
            k = k.getNext();
        }

        if (k == null || k.getNext() == null) {
            return null;
        }

        removeItem = k.getNext();
        k.setNext(removeItem.getNext());

        if (removeItem == last) {
            last = k;
        }

        removeItem.setNext(null);
        return removeItem;
    }

    public Knoten removeAtEnd() {
        removeItem = last;

        if (first == last) {
            first = null;
            last = null;
            return removeItem;
        }

        Knoten k = first;


        while (k.getNext() != last) {
            k = k.getNext();
        }

        last = k;

        last.setNext(null);

        return removeItem;
    }

    public Knoten removeAtBeginning() {
        removeItem = first;

        if (first == last) {
            first = null;
            last = null;
            return removeItem;
        }

        first = first.getNext();
        removeItem.setNext(null);

        return removeItem;
    }

    public void printList(){
        Knoten k = first;
        boolean firstElement = true;
        String s;

        while (k != null){
            if(firstElement){
                s = "";
                firstElement = false;
            }else {
                s = ", ";
            }
            System.out.print(s + k.getNr1()+k.getOperator()+k.getNr2()+"="+k.getResult());
            k = k.getNext();

            s = "";
        }
    }

    public Knoten getFirst() {
        return first;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
