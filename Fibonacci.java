import java.util.Scanner;

public class Fibonacci {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The terms are:");
        for(int i=0;i<n;i++){
            //to print all numbers till nth term.
            System.out.println(fibo(i) + " ");
        }
    }
   public static int fibo(int n){
    if(n<=1){
        //base case
        //First two fibonacci numbers will be printed i.e. 0,1.
        return n;
    }
    //Recursive case: Here recursion occurs
    //To calculate the nth term , we add the (n-1) and (n-2) terms.
    return fibo(n-1) + fibo(n-2);
   }
}


