package functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a,b);
        System.out.println("After Swapping");
        System.out.println(b);
        System.out.println(a);
        in.close();

    }
    static void swap(int a,int b){
       int temp;
       temp=a;
       a=b;
       b=temp;
        
    }
    
}
