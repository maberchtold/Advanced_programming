package w01.aufgabeWandeln;

public class WandelnController {
    public static void main(String[] args) {
        char[] charArr = {'H', 'e', 'l', 'l', 'o', };
        //1. Int to char
        System.out.println(Wandeln.translateIntToChar(42));

        //2. Char to int
        System.out.println(Wandeln.translateCharToInt('8'));

        //3. Char array to string
        System.out.println(Wandeln.translateCharsToString(charArr));
    }
}
