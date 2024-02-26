package w01.aufgabeZeichen;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Zeichen {
    private Random rand = new Random();
    private char[] zeichen;
    private int anzahl;
    private int randAuswahl;

    public Zeichen(int anzahl) {
        char[] zeichenAuswahl = {'a','c','g','*'};

        this.anzahl = anzahl;
        zeichen = new char[anzahl];

        for (int i = 0; i < zeichen.length; i++){
            randAuswahl = rand.nextInt(zeichenAuswahl.length);
            zeichen[i] = zeichenAuswahl[randAuswahl];
        }
    }

    private String printArrStr(){
        String retStr = "";
        for (int i = 0; i < zeichen.length; i++){
            retStr += zeichen[i] + " ";
        }
        return retStr;
    }

    private String getPositions(char userCharInput){
        String retPositions = "";
        boolean firstPosition = true;
        for (int i = 0; i < zeichen.length; i++){
            if (zeichen[i] == userCharInput){
                if (firstPosition){
                    retPositions += i;
                    firstPosition = false;
                }else {
                    retPositions += ", " + i;
                }
            }
        }
        return retPositions;
    }

    private int getFirstPositionWhereCharNotMatching(char userCharInput){
        int returnPosition = -1;

        for (int i = 0; i < zeichen.length; i++){
            if (zeichen[i] != userCharInput && returnPosition < 0){
                returnPosition = i;
            }
        }

        return returnPosition;
    }

    private boolean setCustomChar(char userCharInput, int userPositionInput){
        boolean retBool = false;

        if(userPositionInput < 0 || userPositionInput > zeichen.length - 1){
            retBool = false;
        }else {
            zeichen[userPositionInput] = userCharInput;
            retBool = true;
        }
        return retBool;
    }

    private int countChar(){
        char userCharInput = 'a';
        int charCount = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Geben Sie einen char ein: ");
        userCharInput = scanner.nextLine().charAt(0);

        for (int i = 0; i < zeichen.length; i++){
            if (zeichen[i] == userCharInput){
                charCount++;
            }
        }

        return charCount;
    }

    public void menu(){
        boolean programRunning = true;
        int userInput = 0;
        int position = 0;
        int charCount = 0;
        char userCharInput = 'a';
        int userPositionInput = 0;
        boolean successBool = false;
        String positions;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (programRunning){
            System.out.println("1) ausgeben");
            System.out.println("2) Zeichen suchen");
            System.out.println("3) Erstes anderes Zeichen suchen");
            System.out.println("4) Zeichen ändern");
            System.out.println("5) Häufigkeit");
            System.out.println("6) Programm beenden");
            System.out.print("Wählen Sie: ");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    System.out.println(printArrStr());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Geben Sie einen char ein: ");
                    userCharInput = scanner.nextLine().charAt(0);
                    positions = getPositions(userCharInput);
                    System.out.println("Der character befindet sich an folgenden Positionen:");
                    System.out.println(positions);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Geben Sie einen char ein: ");
                    userCharInput = scanner.nextLine().charAt(0);
                    position = getFirstPositionWhereCharNotMatching(userCharInput);
                    System.out.println("Die erste Position an welcher das Zeichen nicht steht ist:");
                    System.out.println(position);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Geben Sie einen char ein: ");
                    userCharInput = scanner.nextLine().charAt(0);
                    System.out.print("Geben Sie eine Position ein, an welcher der char gesetzt werden soll: ");
                    userPositionInput = scanner.nextInt();
                    scanner.nextLine();

                    successBool = setCustomChar(userCharInput, userPositionInput);
                    if (successBool){
                        System.out.println("Der Char wurde erfolgreich gesetzt");
                    }else{
                        System.out.println("Die Position liegt auserhalb des Array index.");
                    }
                    System.out.println();
                    break;
                case 5:
                    charCount = countChar();
                    System.out.println("Der char kommt "+charCount+" mal im Array vor!");
                    System.out.println();
                    break;
                case 6:
                    programRunning = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Wählen sie einen gültigen Menupunkt aus!");
                    break;
            }
        }
    }
}
