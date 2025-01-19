import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String text =in.nextLine();
        if(palindrome(text.toLowerCase())){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean palindrome(String text){
        //Base case
        if(text==null|| text.length()<=1){
            return true;
        }
        //Check that first and last characters are the same
        char first = text.charAt(0);
        char last = text.charAt(text.length()-1);
        if(first!=last){
            return false;
        }
        //Recursive call with remaining substring
        return palindrome(text.substring(1,text.length()-1));
    }
}
