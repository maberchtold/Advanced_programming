package w09_Rekursion;

public class FibonacciIterativ {
    public static void main(String[] args) {
        fibonacciIterativ(1,1,20);
    }

    public static void fibonacciIterativ(int firstNumber, int secondNumber, int iterations){
        int nextNumber;
        for (int i = 0; i < iterations; i++){
            System.out.println(firstNumber);
            nextNumber = firstNumber + secondNumber;
            firstNumber =secondNumber;
            secondNumber = nextNumber;
        }
    }
}
