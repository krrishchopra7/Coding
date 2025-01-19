import java.util.Scanner;

public class Printfrom1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        numbers(n);
    }
    static void numbers(int n){
        if(n>0){
            numbers(n-1);//Recursion 
            System.out.println(n + " ");//Print the current no.
        }
    }
}
