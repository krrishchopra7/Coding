package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
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
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){

            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
