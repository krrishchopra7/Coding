import java.util.Scanner;

public class Binarysearch {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num= input.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements in the array in sorted order");
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key=input.nextInt();
        int result =search(arr, key, 0, num-1);
        if(result==-1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is found at index " + result);
        }
    }
    static int search(int[] arr,int key,int start,int end){
        if(start>end){
            //Element is not found in the array.
            return -1;
        }
        //To find the middle index.
        int mid = (start + end)/2;

        //If the key is greater than the middle index.
        //We have to proceed forward by (mid+1) and replace by start.
        if(arr[mid]<key){
            return search(arr, key, mid+1, end);
        }
        //If the key is smaller than the middle index.
        //We have to proceed backward by (mid-1) and replace by end.
        if(arr[mid]>key){
            return search(arr, key, start, mid-1);
        }
        //If the key is present in the  middle. *Non recursive case*
        return mid;
    }
    
}
