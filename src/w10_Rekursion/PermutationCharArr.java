package w10_Rekursion;

public class PermutationCharArr {
    public static void main(String[] args) {
        char[] charArr = {'A','B','C'};

        permutation(charArr);
    }

    public static void permutation(char[] charArr){
        permutationHelper(charArr, 0);
    }
    public static void permutationHelper(char[] charArr, int start) {
        if (start == charArr.length-1) {
            System.out.println(String.valueOf(charArr));
        } else {
            for (int i = start; i <= charArr.length-1; i++) {
                swap(charArr, start, i);
                permutationHelper(charArr, start + 1);
                swap(charArr, start, i);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
