package w09_Rekursion;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchRekursiv {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10);
        }

        Arrays.sort(intArr);

        printArr(intArr);

        int targetValue = 4;
        System.out.println("Index of " + targetValue + ": " + findIndexByValRecursive(intArr, targetValue,0, intArr.length - 1));
    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static int findIndexByValRecursive(int[] arr, int val, int lowerBound, int upperBound){
        if (lowerBound <= upperBound){
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            if (arr[mid] == val) {
                return mid;  // Found the value, return index
            } else if (arr[mid] < val) {
                return findIndexByValRecursive(arr, val, mid + 1, upperBound);  // Search in the right half
            } else {
                return findIndexByValRecursive(arr, val, lowerBound, mid - 1); // Search in the left half
            }
        }else {
            return -1;
        }
    }
}
