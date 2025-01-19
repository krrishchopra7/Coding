package arrays;

import java.util.Scanner;

public class Searchin2Darray {
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
        System.out.println("Enter the no to be searched");
        int target= in.nextInt();

        System.out.println(search(arr,target));
    }
    static boolean search(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;

    }
     
    
}
