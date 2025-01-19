import java.util.Scanner;

public class Reverseno {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        reverse(num);
    }
    public static void reverse(int num){
        //If uumber is less than 10, it is already reversed
    if(num<10){
        System.out.println(num);
        return;
    }
    //To get the last digit
    int lastdigit=num%10;
    //Print the last digit
    System.out.print(lastdigit);
    //Recursive call
    reverse(num/10);
}
}
