package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {23,25,7,5,2,8};
        int target = 7;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return target;
    }
    
}
