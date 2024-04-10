package w05_exceptions.exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nachname;
        String vorname;
        int plz;
        String ort;
        int alter;

        while (true){
            try {
                System.out.print("Geben Sie Ihren Nachnamen ein: ");
                nachname = scanner.nextLine();
                nachname = scannerInputText(scanner,"Geben Sie Ihren Nachnamen ein: ");
                System.out.print("Geben Sie Ihren Vornamen ein: ");
                vorname = scanner.nextLine();
                System.out.print("Geben Sie Ihre Postleitzahl ein: ");
                plz = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Geben Sie Ihren Ort ein: ");
                ort = scanner.nextLine();
                System.out.print("Geben Sie Ihr Alter ein: ");
                alter = scanner.nextInt();
                scanner.nextLine();
                System.out.println(nachname + " " + vorname + " " + plz + " " + ort + " " + alter);
                break;
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Ungültige Eingabe!");
            }
        }
    }

    public static String scannerInputText(Scanner scanner, String text){
        String retText = "";
        while (true){
            try {
                System.out.print(text);
                retText = scanner.nextLine();
                break;
            }catch (InputMismatchException e){
                System.out.println("Ungültige Eingabe!");
            }
        }
        return retText;
    }
}
