package w10_Rekursion.parser;

public class Main {
    public static void main(String[] args) {
        Parser p = new Parser("(a+b+c)");
        System.out.println(p.istGueltig());
    }
}
