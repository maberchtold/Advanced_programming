package w07_Sortieralgorithmen;

import java.util.Arrays;

public class ArraySortieren_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,7,4,3,9,45,54,23,3,1,99,55,33,22,88,132,6,3,55,83,31,44,76};

        System.out.println(Arrays.toString(arr));
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr){
        int rightBorder = arr.length-1;
        int swapNr = 0;

        while(rightBorder > 0){
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    swapNr = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swapNr;
                }
            }
            rightBorder--;
        }

        return arr;
    }
}
