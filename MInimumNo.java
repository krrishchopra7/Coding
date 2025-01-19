package arrays;

public class MInimumNo {
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,9};
        System.out.println(minimum(arr));
    }
    static int minimum(int arr[]){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    
}
