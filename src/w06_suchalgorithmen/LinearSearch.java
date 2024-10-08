package w06_suchalgorithmen;

import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] intArr = new int[200];

        for (int i = 0; i < intArr.length; i++){
            intArr[i] = rand.nextInt(100);
        }

        printArr(intArr);

        System.out.println(findIndexByVal(intArr,88));
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int findIndexByVal(int[] arr, int val){
        int retIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == val){
                retIndex = i;
                break;
            }
        }
        return retIndex;
    }
}
