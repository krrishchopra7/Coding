import java.util.Scanner;
//        1
//       212
//      32123
//     4321234
//    543212345
public class pattern7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j + " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
