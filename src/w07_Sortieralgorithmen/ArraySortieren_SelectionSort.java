package w07_Sortieralgorithmen;

import java.util.Arrays;

public class ArraySortieren_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,4,3,9,45,54,23,3,1,99,55,33,22,88,132,6,3,55,83,31,44,76};

        //Selection sort
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr){
        int smallestNumberIndex;
        int smallestNumber;

        for (int i = 0; i < arr.length; i++){
            smallestNumberIndex = i;
            smallestNumber = arr[i];
            for (int j=i; j<arr.length;j++){
                if (arr[j] < smallestNumber){
                    smallestNumberIndex = j;
                    smallestNumber = arr[j];
                }
            }

            arr[smallestNumberIndex] = arr[i];
            arr[i] = smallestNumber;
        }

        return arr;
    }
}
