import java.util.Scanner;

public class Printnotill1 {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        fun(n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    
}
