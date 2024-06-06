package w12_Rekursion.place8Queens;

public class Main {
    public static void main(String[] args) {
        int[] board = new int[8];
        updateArray(board, 0);
    }

    public static void updateArray(int[] board, int index) {
        if (index == board.length) {
            printArray(board);
            return;
        }

        for (int i = 1; i < board.length + 1; i++) {
            if (checkPlacement(board, index, i)) {
                board[index] = i;
                updateArray(board, index + 1);
                board[index] = 0;
            }
        }
    }

    public static boolean checkPlacement(int[] board, int col, int row) {
        for (int i = 0; i < col; i++) {
            if (board[i] == row) {
                return false;
            }

            if (Math.abs(row - board[i]) == Math.abs(col - i)) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
        System.out.println();
    }
}
