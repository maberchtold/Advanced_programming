package w11_Rekursion.labyrinth;

public class Main {
    public static void main(String[] args) {
        char[][] charArr = Muster.getMuster();
        findExit(charArr, 0, 1);
        printArr(charArr);
    }

    public static void findExit(char[][] charArr, int ypos, int xpos){
        setPath(charArr, ypos, xpos);
        if (checkBottom(charArr,ypos,xpos)) {
            findExit(charArr, ypos+1, xpos);
        }
        if (checkTop(charArr,ypos,xpos)) {
            findExit(charArr, ypos-1, xpos);
        }
        if (checkRight(charArr, ypos, xpos)) {
            findExit(charArr, ypos, xpos+1);
        }
        if (checkLeft(charArr, ypos, xpos)) {
            findExit(charArr, ypos, xpos-1);
        }

    }

    public static boolean checkTop(char[][] charArr, int ypos, int xpos){
        if(ypos <= 0){
            System.out.println("Ausgang gefunden "+ypos+" "+xpos);
            return false;
        } else if (charArr[ypos-1][xpos] == '#' || charArr[ypos-1][xpos] == 'O') {
            return false;
        } else{
            return true;
        }
    }

    public static boolean checkBottom(char[][] charArr, int ypos, int xpos){
        if(ypos >= charArr.length - 1){
            System.out.println("Ausgang gefunden "+ypos+" "+xpos);
            return false;
        }else if (charArr[ypos+1][xpos] == '#' || charArr[ypos+1][xpos] == 'O') {
            return false;
        }else {
            return true;
        }
    }

    public static boolean checkLeft(char[][] charArr, int ypos, int xpos){
        if(xpos <= 0){
            System.out.println("Ausgang gefunden "+ypos+" "+xpos);
            return false;
        }else if (charArr[ypos][xpos-1] == '#' || charArr[ypos][xpos-1] == 'O') {
            return false;
        }else {
            return true;
        }
    }

    public static boolean checkRight(char[][] charArr, int ypos, int xpos){
        if(xpos >= charArr[0].length - 1){
            System.out.println("Ausgang gefunden "+ypos+" "+xpos);
            return false;
        }else if (charArr[ypos][xpos+1] == '#' || charArr[ypos][xpos+1] == 'O') {
            return false;
        } else {
            return true;
        }
    }

    public static void setPath(char[][] charArr, int ypos, int xpos){
        charArr[ypos][xpos] = 'O';
    }

    public static void unSetPath(char[][] charArr, int ypos, int xpos){
        charArr[ypos][xpos] = ' ';
    }

    public static void printArr(char[][] charArr){
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
