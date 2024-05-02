package w07_Sortieralgorithmen;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {4, 7, 4, 3, 9, 45, 54, 23, 3, 1, 99, 55, 33, 22, 88, 132};

        System.out.println("Original array: " + Arrays.toString(arr));
        arr = heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int[] heapSort(int[] arr) {
        int arrayLength = arr.length;
        int lastParentIndex = (arrayLength - 2) / 2;

        //Create first complete heap
        for (int i = lastParentIndex; i >= 0; i--) {
            arr = createHeap(arr, i, arrayLength);
        }


        for (int i = arrayLength - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            arr = createHeap(arr, 0, i);
        }

        return arr;
    }

    public static int[] createHeap(int[] arr, int parentIndex, int size) {
        int largest = parentIndex;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        if (leftChildIndex < size && arr[leftChildIndex] > arr[largest]) {
            largest = leftChildIndex;
        }

        if (rightChildIndex < size && arr[rightChildIndex] > arr[largest]) {
            largest = rightChildIndex;
        }

        if (largest != parentIndex) {
            int swap = arr[parentIndex];
            arr[parentIndex] = arr[largest];
            arr[largest] = swap;

            createHeap(arr, largest, size);
        }

        return arr;
    }
}
