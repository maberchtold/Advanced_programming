package w07_Sortieralgorithmen;

import java.util.Arrays;

public class ArraySortieren_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,4,3,9,45,54,23,3,1,99,55,33,22,88,132,6,3,55,83,31,44,76};
        System.out.println(Arrays.toString(arr));
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr){
        for (int i=1; i < arr.length; i++){
            int currVal = arr[i];
            int prevIndex = i - 1;

            while (prevIndex >= 0 && arr[prevIndex] > currVal){
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex = prevIndex - 1;
            }
            arr[prevIndex + 1] = currVal;
        }

        return arr;
    }
}
