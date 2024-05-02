package w09_Rekursion;

public class FibonacciRekursiv {
    public static void main(String[] args) {
        System.out.println("Fibonacci rekursiv:");
        System.out.println(fibonacci(0,1, 20000000));
        System.out.println();
    }

    public static String fibonacci(int firstNumber, int secondNumber, int limit) {
        StringBuilder fibonacciString = new StringBuilder();
        fibonacciHelper(firstNumber, secondNumber, fibonacciString, limit);
        return fibonacciString.toString();
    }

    public static void fibonacciHelper(int firstNumber, int secondNumber, StringBuilder fibonacciString, int limit) {
        if (secondNumber > limit) {

        } else {
            if (fibonacciString.length() > 0) {
                fibonacciString.append(", ");
            }
            fibonacciString.append(secondNumber);
            fibonacciHelper(secondNumber, firstNumber + secondNumber, fibonacciString, limit);
        }
    }
}
