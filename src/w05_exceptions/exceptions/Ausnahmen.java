package w05_exceptions.exceptions;

public class Ausnahmen {
    public static void main(String[] args) {
        int x = 19;
        int y = 0;
        int e = 0;

        try{
            e = divide(x,y);
        }catch (ArithmeticException exe){
            System.out.println("Es kann nicht durch 0 geteilt werden");
        }

        System.out.println(e);
    }

    public static int divide (int a, int b){
        return a/b;
    }
}
