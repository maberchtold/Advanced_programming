package w05_exceptions.exceptions;

public class ArrayZugriff {

    public static void main(String[] args) {
        int[] arr = {4,7,5,9,4,3,5,7,3,5,7,8};
        print(2,arr);

    }

    public static void print(int index, int[] arr) throws MyException{
        try {
            if (index == 2){
                throw new MyException();
            }
            System.out.println(arr[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index liegt nicht im Array");
        }

    }


}

