import java.util.Scanner;

public class Sumofn {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =in.nextInt();
        sum(n);
        System.out.println("Sum of numbers = " + sum(n));
    }
    static int sum(int n){
        if(n==1){
            return 1;//Non recursive call
        }
        else{
            return n + sum(n-1);//Recursive call
        }
    }
}
