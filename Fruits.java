package switchcase;

import java.util.Scanner;

public class Fruits {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit){
            case "Mango":
            System.out.println("King of Fruits");
            break;
            case "Apple":
            System.out.println("A great red fruit");
            break;
            case "Orange":
            System.out.println("Citrus Fruit");
            break;
            case "Grapes":
            System.out.println("Small Fruit");
            break;
            default:
            System.out.println("Enter a valid fruit");
        }
    }
    
}
