package w03_Composition.unternehmen;

import java.util.Locale;
import java.util.Scanner;

public class UnternehmenTest {
    public static void main(String[] args) {
        //Unternehmen
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nameUnternehmen;
        String strasse;
        String hausnummer;
        int postleitzahl;
        String ort;
        String kenziffer;
        int vorwahl;
        int nummer;
        Unternehmen unternehmen;
        Tel tel;
        Adresse adresse;

        //Arbeitnehmer
        int anzArbeitnehmer;
        Arbeitnehmer[] arbeitnehmer;
        String nachname;
        String vorname;
        Adresse adresseArbeitnehmer;
        int anzEmails;
        String[] emailAdressen;
        Tel privatTel;
        Tel natelTel;
        String geburtsdatum;
        String datumDipl;
        String datumEinstellung;
        int gehaltklasse;

        System.out.println("======================\nAdresse Unternehmen\n======================");
        System.out.print("Geben Sie den Namen der Unternehmens ein: ");
        nameUnternehmen = scanner.nextLine();
        System.out.print("Geben Sie die Strasse des Unternehmens ein: ");
        strasse = scanner.nextLine();
        System.out.print("Geben Sie die Hausnummer des Unternehmens ein: ");
        hausnummer = scanner.nextLine();
        System.out.print("Geben Sie die Postleitzahl des Unternehmens ein: ");
        postleitzahl = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie den Ort des Unternehmens ein: ");
        ort = scanner.nextLine();
        System.out.println();
        System.out.println("===========================\nTelefonnummer Unternehmen\n===========================");
        System.out.print("Geben Sie die Kennziffer ein: ");
        kenziffer = scanner.nextLine();
        System.out.print("Geben Sie die Vorwahl ein: ");
        vorwahl = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie die Nummer ein: ");
        nummer = scanner.nextInt();
        scanner.nextLine();

        adresse = new Adresse(strasse, hausnummer, postleitzahl, ort);
        tel = new Tel(kenziffer, vorwahl, nummer);
        unternehmen = new Unternehmen(nameUnternehmen, adresse, tel);

        System.out.print("Geben Sie ein wie viele Arbeitnehmer Sie erfassen möchten: ");
        anzArbeitnehmer = scanner.nextInt();
        scanner.nextLine();
        arbeitnehmer = new Arbeitnehmer[anzArbeitnehmer];

        for (int i = 0; i < arbeitnehmer.length; i++){
            System.out.println("===========================\nArbeitnehmer\n===========================");
            System.out.print("Geben Sie den Nachnahmen für den " + (i+1) + ". Arbeitnehmer ein: ");
            nachname = scanner.nextLine();
            System.out.print("Geben Sie den Vornamen für den " + (i+1) + ". Arbeitnehmer ein: ");
            vorname = scanner.nextLine();
            System.out.print("Geben Sie das Geburtsdatum für den " + (i+1) + ". Arbeitnehmer ein: ");
            geburtsdatum = scanner.nextLine();
            System.out.print("Geben Sie das Datum des erhaltenen Diploms für den " + (i+1) + ". Arbeitnehmer ein: ");
            datumDipl = scanner.nextLine();
            System.out.print("Geben Sie das Datum der Einstellung für den " + (i+1) + ". Arbeitnehmer ein: ");
            datumEinstellung = scanner.nextLine();
            System.out.print("Geben Sie die Gehaltsklasse für den " + (i+1) + ". Arbeitnehmer ein: ");
            gehaltklasse = scanner.nextInt();
            scanner.nextLine();

            System.out.println("===========================\nAdresse\n===========================");
            System.out.print("Geben Sie die Strasse für den " + (i+1) + ". Arbeitnehmer ein: ");
            strasse = scanner.nextLine();
            System.out.print("Geben Sie die Hausnummer für den " + (i+1) + ". Arbeitnehmer ein: ");
            hausnummer = scanner.nextLine();
            System.out.print("Geben Sie die PLZ für den " + (i+1) + ". Arbeitnehmer ein: ");
            postleitzahl = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Geben Sie den Ort für den " + (i+1) + ". Arbeitnehmer ein: ");
            ort = scanner.nextLine();

            adresseArbeitnehmer = new Adresse(strasse, hausnummer, postleitzahl, ort);

            System.out.println("===========================\nEmail Adressen\n===========================");
            System.out.print("Geben Sie ein wie viele Email Adressen Sie für den " + (i+1) + ". Arbeitnehmer erfassen möchten: ");
            anzEmails = scanner.nextInt();
            scanner.nextLine();
            emailAdressen = new String[anzEmails];
            for (int j = 0; j < emailAdressen.length; j++){
                System.out.print("Geben Sie die " + (j+1) + ". Email des " + (i+1) + ". Arbeitnehmer ein: ");
                emailAdressen[j] = scanner.nextLine();
            }

            System.out.println("===========================\nTel Privat\n===========================");
            System.out.print("Geben Sie die Kennziffer ein: ");
            kenziffer = scanner.nextLine();
            System.out.print("Geben Sie die Vorwahl ein: ");
            vorwahl = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Geben Sie die Nummer ein: ");
            nummer = scanner.nextInt();
            scanner.nextLine();
            privatTel = new Tel(kenziffer, vorwahl, nummer);

            System.out.println("===========================\nTel Natel\n===========================");
            System.out.print("Geben Sie die Kennziffer ein: ");
            kenziffer = scanner.nextLine();
            System.out.print("Geben Sie die Vorwahl ein: ");
            vorwahl = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Geben Sie die Nummer ein: ");
            nummer = scanner.nextInt();
            scanner.nextLine();
            natelTel = new Tel(kenziffer, vorwahl, nummer);

            arbeitnehmer[i] = new Arbeitnehmer(nachname, vorname, adresseArbeitnehmer, emailAdressen, privatTel, natelTel, geburtsdatum, datumDipl, datumEinstellung, gehaltklasse);
        }

        unternehmen.setArbeitnehmer(arbeitnehmer);

        System.out.println();
        System.out.println(unternehmen);
    }
}
