package loops;

import java.util.Scanner;

public class Occurrences {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= 1727374757;
        int count =0;
        while(n>0){
            int rem=n%10;
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
    
}
