package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many elements");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void bubblesort(int[] arr){
        //steps- n-1 times
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
