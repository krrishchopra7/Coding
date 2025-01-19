package loops;

import java.util.Scanner;

public class Fibonaccino {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0;
        int b=1;
        int n = in.nextInt();
        for(int i=0;i<=n;i++){
            int f=a;
            a=a+b;
            b=f;
            System.out.println(f);
        }
    }
    
}
