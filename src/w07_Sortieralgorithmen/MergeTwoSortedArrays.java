
package w07_Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = gererateRandArr(10);
        int[] arr2 = gererateRandArr(15);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] retArr = mergeSortedArrays(arr1,arr2);

        System.out.println(Arrays.toString(retArr));
    }

    public static int[] gererateRandArr(int length){
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        return arr;
    }

    public static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int indexFirst = 0, indexSecond = 0, indexMerged = 0;

        while (indexFirst < firstArray.length && indexSecond < secondArray.length) {
            if (firstArray[indexFirst] < secondArray[indexSecond]) {
                mergedArray[indexMerged++] = firstArray[indexFirst++];
            } else {
                mergedArray[indexMerged++] = secondArray[indexSecond++];
            }
        }

        while (indexFirst < firstArray.length) {
            mergedArray[indexMerged++] = firstArray[indexFirst++];
        }

        while (indexSecond < secondArray.length) {
            mergedArray[indexMerged++] = secondArray[indexSecond++];
        }

        return mergedArray;
    }
}
//Das Mergen von 2 Arrays gehört zu der Komplexitätsklasse O(n)