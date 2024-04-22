package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.AufgabenArraysVonReferenzen_Bibliothek;

import java.util.Locale;
import java.util.Scanner;

public class Bibliothek {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {

        Buch[] bookArr;
        int bookArrSize = 0;
        int userMenuInput = 0;
        boolean programRunning = true;

        System.out.print("Geben Sie ein wie viele Bücher Sie verwalten möchten: ");
        bookArrSize = scanner.nextInt();
        scanner.nextLine();
        bookArr = new Buch[bookArrSize];

        bookArr = regaleFuellen(bookArr);

        while (programRunning){
            System.out.println("1) Anzeige");
            System.out.println("2) Ausleihe");
            System.out.println("3) Rückgabe");
            System.out.println("4) Programm beenden");
            System.out.print("Wählen Sie: ");
            userMenuInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (userMenuInput){
                case 1:
                    anzeige(bookArr);
                    System.out.println();
                    break;
                case 2:
                    ausleihe(bookArr);
                    System.out.println();
                    break;
                case 3:
                    rueckgabe(bookArr);
                    System.out.println();
                    break;
                case 4:
                    programRunning = false;
                    break;
                default:
                    System.out.println("Bitte wählen Sie einen gültigen Menupunkt aus!");
                    System.out.println();
                    break;
            }
        }
    }

    public static Buch[] regaleFuellen(Buch[] bookArr){
        String bookAuthor;
        String bookTitle;
        int signature = 1;
        for (int i = 0; i < bookArr.length; i++){
            System.out.print("Geben Sie den Titel des "+signature+". Buches ein: ");
            bookTitle = scanner.nextLine();
            System.out.print("Geben Sie den Autor des "+signature+". Buches ein: ");
            bookAuthor = scanner.nextLine();
            bookArr[i] = new Buch(bookAuthor, bookTitle, signature);
            signature++;
        }
        return bookArr;
    }

    public static void anzeige(Buch[] bookArr){
        for (int i = 0; i < bookArr.length; i++){
            System.out.println(bookArr[i].toString());
        }
    }

    public static void ausleihe(Buch[] bookArr){
        int selection = 0;

        System.out.println("Folgende Bücher stehen können noch ausgeliehen werden:");
        System.out.println();
        for (int i = 0; i < bookArr.length; i++){
            if (!bookArr[i].isAusgeliehen()){
                System.out.println(bookArr[i].toString());
            }
        }
        System.out.println();
        System.out.print("Geben Sie die Signatur des gewünschten Buches ein: ");
        selection = scanner.nextInt();
        scanner.nextLine();

        if (selection < 1 || selection > bookArr.length || bookArr[selection - 1].isAusgeliehen()){
            System.out.println();
            System.out.println("Das Buch konne nicht ausgeliehen werden!");
        }else {
            bookArr[selection - 1].setAusgeliehen(true);
        }
    }

    public static void rueckgabe(Buch[] bookArr){
        int selection = 0;

        System.out.println("Folgende Bücher wurden ausgeliehen:");
        System.out.println();
        for (int i = 0; i < bookArr.length; i++){
            if (bookArr[i].isAusgeliehen()){
                System.out.println(bookArr[i].toString());
            }
        }
        System.out.println();
        System.out.print("Geben Sie die Signatur des gewünschten Buches ein: ");
        selection = scanner.nextInt();
        scanner.nextLine();

        if (selection < 1 || selection > bookArr.length || !bookArr[selection - 1].isAusgeliehen()){
            System.out.println();
            System.out.println("Das Buch konne nicht zurückgegeben werden!");
        }else {
            bookArr[selection - 1].setAusgeliehen(false);
        }
    }
}
