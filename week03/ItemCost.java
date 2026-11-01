import java.util.Scanner;

/*
 * File:    ItemCost.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Emmanuel Johnson Owajima (25/16530)
 *
 * Reads an item name, the quantity bought and the unit price, then prints
 * a purchase summary with the total cost in Naira (NGN).
 * The quantity must be at least 1 and the unit price cannot be negative.
 */
public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============== ITEM COST ===============");

        // String: the item name can contain spaces, so use nextLine().
        System.out.print("Enter item name: ");
        String itemName = input.nextLine().trim();
        if (itemName.isEmpty()) {
            System.out.println("Invalid input. Item name cannot be empty.");
            input.close();
            return;
        }

        // int: quantity is a whole number.
        System.out.print("Enter quantity: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Quantity must be a whole number.");
            input.close();
            return;
        }
        int quantity = input.nextInt();
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Quantity must be at least 1.");
            input.close();
            return;
        }

        // double: a price can have kobo (decimal part).
        System.out.print("Enter unit price (NGN): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Unit price must be a number.");
            input.close();
            return;
        }
        double unitPrice = input.nextDouble();
        if (unitPrice < 0) {
            System.out.println("Invalid price. Unit price cannot be negative.");
            input.close();
            return;
        }

        // int * double gives a double, so no kobo is lost.
        double totalCost = quantity * unitPrice;

        // Output: %,.2f adds thousands separators and 2 decimal places.
        System.out.println();
        System.out.println("=========== PURCHASE SUMMARY ===========");
        System.out.println("Item       : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit Price : NGN %,.2f%n", unitPrice);
        System.out.printf("Total Cost : NGN %,.2f%n", totalCost);
        System.out.println("========================================");

        input.close();
    }
}
