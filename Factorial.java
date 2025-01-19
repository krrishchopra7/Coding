import java.util.Scanner;

public class Factorial {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= in.nextInt();
        if(num<0){
            System.out.println("Factorial is not defined");
        }
        else{
            int result = factorial(num);
            System.out.println("The factorial of " + num + " is " + result);
        }
    }
    public static int factorial(int num){
        if(num==0){
            //base condition:Factorial of 0 is 1.
            return 1;
        }
        else{
            //Recursion occurs here
            //The factorial of n = n times the factorial of (n-1).
            return num*factorial(num-1);
        }
    }
    
}
