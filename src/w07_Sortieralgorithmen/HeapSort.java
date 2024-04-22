package w07_Sortieralgorithmen;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {4,7,4,3,9,45,54,23,3,1,99,55,33,22,88,132,6,3,55,83,31,44,76};

        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        int lastIndex = arr.length-1;
        int lastParent = 0;
        if (lastIndex % 2 == 0){
            lastParent = (lastIndex-2)/2;
        }else {
            lastParent = (lastIndex-1)/2;
        }

        System.out.println(lastParent);
    }
}
