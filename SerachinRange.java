package arrays;

public class SerachinRange {
    public static void main(String[] args) {
        int arr[]= {23,25,7,5,2,8};
        int target = 7;
        int ans = linearsearch(arr,target,1,3);
        System.out.println(ans);
    }
    static int linearsearch(int arr[], int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return target;
    }
    
}
