package w08_Rekursion;

public class AufgabenRekursion {
    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println("5^10 rekursiv:");
        int result = power(5,5);
        System.out.println(result);
        System.out.println();
        
        //Aufgabe 2
        System.out.println("x*y rekursiv:");
        result = multiplikation(5,7);
        System.out.println(result);
    }

    public static int power(int base, int exponent){
        if (exponent == 1){
            return base;
        }else {
            return  base * power(base, exponent-1);
        }
    }

    public static int multiplikation(int x, int y){
        if (y == 1){
            return x;
        }else {
            return  x + multiplikation(x, y-1);
        }
    }
}
