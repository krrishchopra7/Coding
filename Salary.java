package loops;

import java.util.Scanner;

public class Salary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int salary = input.nextInt();
        if(salary>=25000){
            System.out.println("Very Good");
        }
        else{
            System.out.println("Work Hard");
        }
    }
    
}
