package w06_suchalgorithmen;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] intArr = new int[200];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(100);
        }

        Arrays.sort(intArr);

        printArr(intArr);

        int targetValue = 66;
        System.out.println("Index of " + targetValue + ": " + findIndexByVal(intArr, targetValue));
    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int findIndexByVal(int[] arr, int val) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            if (arr[mid] == val) {
                return mid;  // Found the value, return index
            } else if (arr[mid] < val) {
                lowerBound = mid + 1;  // Search in the right half
            } else {
                upperBound = mid - 1;  // Search in the left half
            }
        }
        return -1;  // Value not found
    }
}
