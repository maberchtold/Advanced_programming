package w06;

import java.util.Random;

public class SwapArrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++){
            intArr[i] = rand.nextInt(100);
        }
        printArr(intArr);

        intArr = swapArr1(intArr);

        printArr(intArr);
    }

    public static int[] swapArr1(int[] arr){
        int tempInt;
        int reverseCounter = arr.length-1;

        for (int i = 0; i < (arr.length/2); i++){
            tempInt = arr[i];
            arr[i] = arr[reverseCounter];
            arr[reverseCounter] = tempInt;
            reverseCounter--;
        }

        return arr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
