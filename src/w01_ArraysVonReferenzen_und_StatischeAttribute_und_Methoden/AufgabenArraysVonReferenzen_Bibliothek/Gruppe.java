package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.AufgabenArraysVonReferenzen_Bibliothek;

import java.util.Locale;
import java.util.Scanner;

public class Gruppe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String userInputName;
        int userInputAlter;
        int summeAlter = 0;
        int durchschnittsalter = 0;
        Person[] persArr = new Person[5];

        for (int i=0; i < persArr.length; i++){
            System.out.print("Geben Sie den namen der "+(i+1)+". Person ein: ");
            userInputName = scanner.nextLine();
            System.out.print("Geben Sie das Alter der "+(i+1)+". Person ein: ");
            userInputAlter = scanner.nextInt();
            scanner.nextLine();
            persArr[i] = new Person(userInputName, userInputAlter);
        }

        for (int i=0; i < persArr.length; i++){
            System.out.println(persArr[i].toString());
        }

        for (int i=0; i < persArr.length; i++){
            summeAlter += persArr[i].getAlter();
        }

        durchschnittsalter = summeAlter / persArr.length;

        System.out.println();
        System.out.println("Das Durchschnittsalter aller Personen beträgt: "+ durchschnittsalter);
    }
}
