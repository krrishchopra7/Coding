import java.util.Scanner;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(sorted(arr, size));
    }
    public static boolean sorted(int[] arr,int n){
        // Base case
        if(n==1||n==0){
            return true;
        }
        //Check if the current element is greater than the next element
        if(arr[n-1]>arr[n-2]){
            //Check the remaining array
            return sorted(arr, n-1);
        }
        else{
            return false;
        }
    }
    
}
