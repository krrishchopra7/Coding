import java.util.Scanner;

public class Sumofdigits {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= in.nextInt();
        sumofdigits(n);
        System.out.println("The sum of digits = "+ sumofdigits(n));
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;//Non recursive case
        }
        else{
            //n % 10 extracts the last digit of n using the modulo operator.
            //The modulo operation gives the remainder after dividing n by 10. In this case, the remainder will be the last digit.
            //sumOfDigits (n / 10) makes a recursive call to the sumOfDigits function itself, but with n divided by 10 (n / 10).
            //This effectively removes the last digit from n.
            return n%10 + sumofdigits(n/10);
            //This line combines the extracted last digit (n % 10) with the sum returned by the recursive call (sumOfDigits(n / 10)).
            //The recursive call (sumOfDigits(n / 10)) will have processed the remaining digits and returned their sum.
            //By adding the extracted last digit to this sum, we accumulate the sum of all digits in the original n.
        }
    }
}
