package pruefungsvorbereitung.zugkomposition;

public abstract class Vehicle {

    private String name = null;

    private Vehicle next = null;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Vehicle getNext() {
        return next;
    }

    public void print(){
        System.out.print("["+name+"]");
        if (next != null){
            System.out.print(" - ");
            next.print();
        }
    }

    public void attach(Vehicle next) throws VehicleException {
        if (this.next != null){
            throw new AlreadyAttached();
        }else {
            this.next = next;
            System.out.println(next.getName()+" wurde an "+ this.name +" angehängt!");
        }
    }
}
