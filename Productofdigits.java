import java.util.Scanner;

public class Productofdigits {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= in.nextInt();
    product(n);
    System.out.println("The product of digits = " + product(n));
    }
    public static int product(int n){
        //Base case
        if(n==0){
            return 1;
        }
        //Get the last digit
        int lastdigit=n%10;
        //to find the product of remaining digits
        int remainingno= product(n/10);
        return lastdigit * remainingno;
        //can also be written as : return n%10 * product(n/10);
        }
    
}
