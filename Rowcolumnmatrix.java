package arrays;

import java.util.Scanner;

public class Rowcolumnmatrix {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("ENter the no to be searched");
        int target=in.nextInt();
        System.out.println(search(arr, target));
    }
    static int[] search(int[][] arr, int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length&& col>=0){
            if(arr[row][col]==target){
            return new int[]{row,col};
        }
        if(arr[row][col]<target){
            row++;
        }else{
            col--;
        }
    }
    return new int[]{-1,-1};
    }
    
}
