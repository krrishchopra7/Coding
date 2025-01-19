package arrays;

import java.util.Scanner;

public class Maxwealth {
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
        System.out.println(maxwealth(arr));
    }
    public static int maxwealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int person =0;person<arr.length;person++){
            int sum=0;
            for(int account =0;account<arr[person].length;account++){
                sum=sum+arr[person][account];
            }
            if(sum>ans){
                ans =sum;
            }

        }
        return ans;
    }
    
}
