import java.util.Scanner;

public class bubblesorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        bubbleSort(arr, rows, cols);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[][] arr, int rows, int cols) {
        if (rows == 0 || cols == 1) {
            return; // Base case: no rows or only one column
        }

        // Sort the current row
        for (int i = 0; i < cols - 1; i++) {
            if (arr[rows - 1][i] > arr[rows - 1][i + 1]) {
                int temp = arr[rows - 1][i];
                arr[rows - 1][i] = arr[rows - 1][i + 1];
                arr[rows - 1][i + 1] = temp;
            }
        }

        // Recursively sort remaining rows
        bubbleSort(arr, rows - 1, cols);
    }
}
