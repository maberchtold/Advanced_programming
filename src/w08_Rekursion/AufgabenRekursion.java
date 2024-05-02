package w08_Rekursion;

import java.io.File;
import java.util.Arrays;

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
        System.out.println();

        //Aufgabe 3
        System.out.println("Fibonacci rekursiv:");
        System.out.println(fibonacci(0,1, 20000000));
        System.out.println();

        //Aufgabe 4
        System.out.println("Verzeichnis rekursiv:");
        verzeichnisRekursiv("/Users/matteo/Desktop/HESSO", 0);
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

    public static String fibonacci(int firstNumber, int secondNumber, int limit) {
        StringBuilder fibonacciString = new StringBuilder();
        fibonacciHelper(firstNumber, secondNumber, fibonacciString, limit);
        return fibonacciString.toString();
    }

    public static void fibonacciHelper(int firstNumber, int secondNumber, StringBuilder fibonacciString, int limit) {
        if (secondNumber > limit) {
            return;
        } else {
            if (fibonacciString.length() > 0) {
                fibonacciString.append(", ");
            }
            fibonacciString.append(secondNumber);
            fibonacciHelper(secondNumber, firstNumber + secondNumber, fibonacciString, limit);
        }
    }

    public static void verzeichnisRekursiv(String rootDirectory, int offset){
        File[] files;
        File fileObject = new File(rootDirectory);
        files = fileObject.listFiles();

        for (int i=0; i < files.length; i++){
            for (int j=0; j<offset; j++){
                System.out.print("   ");
            }
            System.out.print(files[i].getName()+ " ");
            System.out.println();
            if (files[i].isDirectory()){
                verzeichnisRekursiv(files[i].toString(), offset+1);
            }
        }
    }
}
