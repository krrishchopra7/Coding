package loops;

import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        //Input till user press X 
        while(true){
            //taking the operator as input
            char op = in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //input two no.
                int n1= in.nextInt();
                int n2= in.nextInt();
                System.out.println("ANSWER=");
                if(op=='+'){
                    System.out.println(n1+n2);
                }
                else if(op=='-'){
                    System.out.println(n1-n2);
                }
                else if(op=='*'){
                    System.out.println(n1*n2);
                }
                else if(op=='/'){
                    System.out.println(n1/n2);
                }
                else if(op=='%'){
                    System.out.println(n1%n2);
                }

            }
        }
    }
    
}
