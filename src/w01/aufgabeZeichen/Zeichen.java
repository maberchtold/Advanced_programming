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

    public void menu(){
        boolean programRunning = true;
        int userInput = 0;
        char userCharInput = 'a';
        String positions;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (programRunning){
            System.out.println("1) ausgeben");
            System.out.println("2) Zeichen suchen");
            System.out.println("3) Erstes anderes Zeichen suchen");
            System.out.println("4) Zeichen ändern");
            System.out.println("5) Häufigkeit");
            System.out.println("1) Programm beenden");
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println();
                    System.out.println("Wählen sie einen gültigen Menupunkt aus!");
                    break;
            }
        }
    }
}
