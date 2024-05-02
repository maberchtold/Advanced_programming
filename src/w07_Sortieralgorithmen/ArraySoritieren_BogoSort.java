package w07_Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class ArraySoritieren_BogoSort {
    public static void main(String[] args) {
        int[] arr = {4,7,4,43,66,21,11,34,33,89,31,2,55};
        System.out.println(Arrays.toString(arr));
        arr = bogoSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bogoSort(int[] arr){
        Random rand = new Random();
        int rand1 = 0;
        int rand2 = 0;
        int tempNr = 0;

        while (!arrIsSorted(arr)){
            rand1 = rand.nextInt(arr.length);
            rand2 = rand.nextInt(arr.length);

            tempNr = arr[rand1];
            arr[rand1] = arr[rand2];
            arr[rand2] = tempNr;
        }
        return arr;
    }

    public static boolean arrIsSorted(int[] arr){
        boolean isSorted = true;
        for (int i = 1; i<arr.length; i++){
            if (arr[i] < arr[i-1]){
                isSorted = false;
            }
        }
        return isSorted;
    }
}
