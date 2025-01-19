package functions;

import java.util.Scanner;

public class AmstrongNo {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = in.nextInt();
  
      int original = n;
      int sum = 0;
  
      while (n > 0) {
        int rem = n % 10;
        sum =sum+(rem*rem*rem); // Cube the digit and add to sum
        n =n/10;
      }
  
      if (sum == original) {
        System.out.println(original + " is an Armstrong number");
      } else {
        System.out.println(original + " is not an Armstrong number");
      }
    }
  }