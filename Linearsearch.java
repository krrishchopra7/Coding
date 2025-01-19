import java.util.Scanner;

public class Linearsearch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target=in.nextInt();
        int index= search(arr, target, 0);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index " + index);
        }
    }
    public static int search(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;//Element not found
        }
        if(arr[index]==target){
            return index;//Element found;
        }
        return search(arr,target,index+1);//Recusion occurs
    }
    
}
