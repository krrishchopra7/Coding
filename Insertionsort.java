package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many elements");
    int n = in.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    insertion(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void insertion(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }
}