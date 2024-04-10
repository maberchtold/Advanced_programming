package w05_exceptions.exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int a = 0;
        int b = 0;
        int c = 0;
        while (true){
            try {
                System.out.print("Geben Sie die erste Zahl ein: ");
                a = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Geben Sie die zweite Zahl ein: ");
                b = scanner.nextInt();
                scanner.nextLine();
                c = a/b;
                System.out.println(c);
                break;
            }catch (ArithmeticException e){
                System.out.println("Es kann nicht durch 0 geteilt werden.");
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Geben Sie Zahlen ein.");
            }
        }
    }
}
