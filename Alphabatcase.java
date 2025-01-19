package loops;

import java.util.Scanner;

public class Alphabatcase {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(1);

        if(ch>='a'&& ch<='z'){
            ch=(char) (ch-32);
        }
        System.out.println(ch);
    }
    
}
