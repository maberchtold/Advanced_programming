package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.aufgabeWandeln;

public class Wandeln {
    public static char translateIntToChar(int nr){
        char retChar = 'a';
        retChar = Integer.toString(nr).charAt(0);
        return retChar;
    }

    public static int translateCharToInt(char character){
        int retInt = 0;
        retInt = Integer.parseInt(String.valueOf(character));
        return retInt;
    }

    public static String translateCharsToString(char[] charArr){
        String retStr = "";
        for (int i = 0; i < charArr.length; i++){
            retStr += charArr[i];
        }
        return retStr;
    }
}
