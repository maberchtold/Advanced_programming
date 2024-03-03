package w02.aufgabeMietwagen;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MietwagenVerleih {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Auto[] autos;

    public MietwagenVerleih(int anzAutos) {
        autos = new Auto[anzAutos];
        String autonummer;
        String groessenklasse;
        double preisProTag;

        for (int i = 0; i < autos.length; i++){
            System.out.print("Geben sie die Autonummer des "+(i+1)+". Autos ein: ");
            autonummer = scanner.nextLine();
            System.out.print("Geben sie die Grössenklasse des "+(i+1)+". Autos ein: ");
            groessenklasse = scanner.nextLine();
            System.out.print("Geben sie den Mietpreis des "+(i+1)+". Autos ein: ");
            preisProTag = scanner.nextDouble();
            scanner.nextLine();

            setAuto(i, new Auto(groessenklasse, autonummer, 0, preisProTag));
        }
    }

    public void setAuto(int index, Auto auto) {
        autos[index] = auto;
    }

    public void anzeige(){
        for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i].toString());
        }
    }

    public String mieten(String groessenklasse, int mietdauer){
        String autonummer = "";

        for (int i = 0; i < autos.length; i++){
            if (autos[i].getGroessenklasse().equals(groessenklasse) && !autos[i].isVermietet()){
                autos[i].setAnzVermieteteTage(mietdauer);
                autos[i].setVermietet(true);
                autonummer = autos[i].getAutonummer();
            }
        }
        return autonummer;
    }

    public double zurueckgeben(String autonummer){
        double preis = 0;

        for (int i = 0; i < autos.length; i++){
            if (autos[i].getAutonummer().equals(autonummer) && autos[i].isVermietet()){
                autos[i].setVermietet(false);
                preis = autos[i].getPreisProTag() * autos[i].getAnzVermieteteTage();
                autos[i].setAnzVermieteteTage(0);
            }
        }

        return preis;
    }

    public void menu(){
        boolean programRunning = true;
        int userInput;
        int mietdauer;
        double preis;
        String groessenklasse;
        String autonummer;
        while (programRunning){
            System.out.println("1) Mieten");
            System.out.println("2) Zurückgeben");
            System.out.println("3) Anzeigen");
            System.out.println("4) Programm beenden");
            System.out.print("Wählen Sie: ");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    System.out.print("Geben Sie die gewünschte Grössenklasse ein: ");
                    groessenklasse = scanner.nextLine();
                    System.out.print("Geben Sie die gewünschte Mietdauer in Tagen ein: ");
                    mietdauer = scanner.nextInt();
                    autonummer = mieten(groessenklasse, mietdauer);
                    if (autonummer.isEmpty()){
                        System.out.println("Es wurde kein passendes auto gefunden");
                    }else{
                        System.out.println("Sie erhalten das auto mit der Autonummer: "+autonummer);
                    }
                    break;
                case 2:
                    System.out.print("Geben Sie die Autonummer des Autos, welches Sie zurück geben möchten, ein: ");
                    autonummer = scanner.nextLine();
                    preis = zurueckgeben(autonummer);
                    if (preis == 0){
                        System.out.println("Das angegebene Auto kann nicht zurückgegeben werden");
                    }else{
                        System.out.println("Das Auto wurde zurückgegeben. Sie müssen "+preis+"CHF bezahlen.");
                    }
                    break;
                case 3:
                    anzeige();
                    break;
                case 4:
                    programRunning = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int anzAutos;
        MietwagenVerleih mwv;

        System.out.print("Geben Sie die anzahl Autos ein: ");
        anzAutos = scanner.nextInt();
        scanner.nextLine();

        mwv = new MietwagenVerleih(anzAutos);
        mwv.menu();
    }
}
