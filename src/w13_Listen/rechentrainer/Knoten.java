package w13_Listen.rechentrainer;

public class Knoten {
    private int nr1, nr2;
    private char operator;
    private int result;
    private int attempts;
    private Knoten next;

    public Knoten(int nr1, int nr2, char operator, int result) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.operator = operator;
        this.result = result;
        this.attempts = 0;
    }

    public int getNr1() {
        return nr1;
    }

    public int getNr2(){
        return nr2;
    }

    public char getOperator() {
        return operator;
    }

    public int getResult() {
        return result;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public Knoten getNext() {
        return next;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
