package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    
    }
    @SuppressWarnings("resource")
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int n1= in.nextInt();
        int n2= in.nextInt();
        int sum = n1+n2;
        System.out.println("The sum =" +sum);

    }
    
}
