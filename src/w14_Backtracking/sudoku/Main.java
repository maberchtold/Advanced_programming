package w14_Backtracking.sudoku;

public class Main {

    public static int[][] sudokuCanvas = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public static void main(String[] args) {
        printCanvas();
    }

    public static void printCanvas() {
        for (int i = 0; i < sudokuCanvas.length; i++) {
            for (int j = 0; j < sudokuCanvas.length; j++) {
                System.out.print(sudokuCanvas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
