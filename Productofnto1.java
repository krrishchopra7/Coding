import java.util.Scanner;

public class Productofnto1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        product(n);
        System.out.println(product(n));
    }
    static int product(int n){
        if(n==1){
            return 1;//Non recursive
        }
        else{
            return n * product(n-1);//Recursive call
        }
    }
}
