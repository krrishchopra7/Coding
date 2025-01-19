// * 
// * * 
// * * *
// * * * *

import java.util.Scanner;

public class recursionpattern1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        pattern(n-1);
    }
    
}
