package w07_Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class FindPlateau {
    public static void main(String[] args) {
        int[] arr = gererateRandArr(100);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        biggestPlateau(arr);
    }

    public static int[] gererateRandArr(int length){
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        return arr;
    }

    public static void biggestPlateau(int[] arr){
        int tempPlatauNr = -1;
        int tempPlatauLength = 0;
        int maxPlatauNr = -1;
        int maxPlatauLength = 0;

        for (int i = 0; i<arr.length; i++){
            tempPlatauLength++;
            if (arr[i] != tempPlatauNr){
                if (tempPlatauLength > maxPlatauLength){
                    maxPlatauLength = tempPlatauLength;
                    maxPlatauNr = tempPlatauNr;
                }

                tempPlatauNr = arr[i];
                tempPlatauLength = 0;
            }
        }

        System.out.println("Das grösste Plateau beinhaltet "+maxPlatauLength+" mal die Nummer "+maxPlatauNr);
    }
}
