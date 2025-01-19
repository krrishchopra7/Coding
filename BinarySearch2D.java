package arrays;

import java.util.Scanner;

public class BinarySearch2D {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=in.nextInt();
        System.out.println("Enter the number of columns");
        int cols= in.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            bubblesort(arr[i]);
        }
        System.out.println("Enter the elements to search");
        int target=in.nextInt();
        boolean found =false;
        for(int i=0;i<rows;i++){
            
        }
    }

    private static void bubblesort(int[] is) {
        throw new UnsupportedOperationException("Unimplemented method 'bubblesort'");
    }
    
}
