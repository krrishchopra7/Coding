import java.util.Scanner;

public class recursionpattern2 {
        public static void printPattern(int n) {
            if (n == 0) {
                return;
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            printPattern(n - 1);
        }
    
        public static void main(String[] args) {
            
           Scanner in = new Scanner(System.in);
           int n=in.nextInt();
            printPattern(n);
        }
    }
    
