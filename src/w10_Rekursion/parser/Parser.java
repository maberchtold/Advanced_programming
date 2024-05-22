package w10_Rekursion.parser;

public class Parser {
    private String ch;
    private int position;

    // Konstruktor
    public Parser(String zeichenkette) {
        ch = zeichenkette;
    }

    // Methoden
    private void nextPosition() {
        ++position;
    }

    private boolean operator() {
        if (position == ch.length())
            return false;

        char c = ch.charAt(position);

        switch (c) {
            case '+':
            case '*':
            case '-':
            case '/':
                return true;
            default:
                return false;
        }
    }

    private boolean operand() {
        if (position == ch.length())
            return false;

        char c = ch.charAt(position);

        if (c >= 'a' && c <= 'z')
            return true;

        return false;
    }

    private boolean equals(char car) {
        if (position == ch.length())
            return false;
        if (ch.charAt(position) == car)
            return true;
        return false;
    }

    public boolean istGueltig() {
        position = 0;
        // G�ltig, wenn Ausdruck g�ltig und alle Zeichen betrachtet
        if (check() && position == ch.length())
            return true;
        return false;
    }

    private boolean check() {

        if (operand()) { 			// Kann beginnen mit Variable
            nextPosition();
            return true;
        }

        // Komplexen Ausdruck pr�fen
        if (!equals('('))			// Ausdruck beginn mit (
            return false;

        nextPosition();				// gleich() geht nicht selbst voran

        if (!check())				// Nach Klammer folgt Variable oder Ausdruck
            return false;

        if (!operator())			// nach Variable/Ausdruck steht operator
            return false;

        nextPosition();

        if (!check())				// nach Operator steht Variable oder Ausdruck
            return false;

        if (!equals(')'))			// am Schluss steht )
            return false;

        nextPosition(); 			// gleich() geht nicht selbst voran
        return true;
    }
}
