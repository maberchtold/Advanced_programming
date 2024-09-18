package w09_Rekursion;

import java.util.Date;

public class Hanoi {
    public static void main(String[] args) {
        Date dAnfang;
        Date dEnde;
        long fib=0;
        int FIBZAHL = 45;

        dAnfang = new Date();
        fib = fibonacciIterativ (FIBZAHL);
        dEnde = new Date();
        System.out.println("Fibonacci iterativ von " + FIBZAHL + " ist "
                + fib + ": " + (dEnde.getTime() - dAnfang.getTime()) +
                "ms wurden ben�tigt.");

        dAnfang = new Date();
        fib = fibonacciRekursiv (FIBZAHL);
        dEnde = new Date();
        System.out.println("Fibonacci rekursiv von " + FIBZAHL + " ist "
                + fib + ": " + (dEnde.getTime() - dAnfang.getTime()) +
                "ms wurden ben�tigt.");
    }

    static public long fibonacciRekursiv (int zahl) {
        if (zahl == 0 || zahl == 1)
            return zahl;
        else
            return fibonacciRekursiv(zahl-1)+fibonacciRekursiv(zahl-2);
    }

    static public long fibonacciIterativ (int n) {
        long a=1;
        long b=0;
        long c=0;

        for (int i = 0; i < n; i++) {
            c=a;
            a=a+b;
            b=c;
        }
        return a;
    }
}
