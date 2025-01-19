import java.util.Scanner;

public class pattern5 {
     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        code1(n);
        code2(n);

    }
    static void code1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void code2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
