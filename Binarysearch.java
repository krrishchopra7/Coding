package arrays;

import java.util.Scanner;

public class Binarysearch {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = in.nextInt();

        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Call bubble sort function to sort the array before searching
        bubbleSort(arr);

        System.out.println("Enter the number to be searched");
        int key = in.nextInt();

        System.out.println("Element is found at position");
        System.out.println(binarysearch(arr, key));
    }

    // Bubble sort function for ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarysearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] > key) {
                end = middle - 1;
            } else if (arr[middle] < key) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
