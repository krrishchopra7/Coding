
//*
//* *
//* * *
//* * * *
//* * * * *

import java.util.Scanner;

public class pattern1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
