<<<<<<< HEAD
import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {
            "Chicken Adobo with Rice",
            "Fried Chicken with Rice",
            "Chicken Sopas",
            "4pc Siomai",
            "Filipino-style Spaghetti",
            "Carbonara",
            "Banana Cue",
            "Extra Rice",
            "Gulaman drink",
            "Four Seasons drink"
        };

        double[] prices = {
            120,  // Chicken Adobo with Rice
            110,  // Fried Chicken with Rice
            40,   // Chicken Sopas
            25,   // 4pc Siomai
            80,   // Filipino-style Spaghetti
            80,   // Carbonara
            25,   // Banana Cue
            20,   // Extra Rice
            20,   // Gulaman drink
            20    // Four Seasons drink
        };

        int totalQuantity = 0;
        double totalBeforeDeduction = 0;
        double totalDeduction = 0;

        while (true) {
            // Displaying Menu
            System.out.println("=====   M E N U   =====");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%d. %-25s - $%.2f%n", (i+1), items[i], prices[i]);
            }

            // Input of user or customer
            System.out.print("\nEnter item number: ");
            int item = sc.nextInt();
            System.out.print("Enter quantity (1-10): ");
            int qty = sc.nextInt();

            // Validation of inputs
            if (item < 1 || item > items.length || qty < 1 || qty > 10) {
                System.out.println("\nInvalid order! Please enter a valid item and quantity.\n");
            } else {
                System.out.print("Are you a student? (Y/N): ");
                char student = sc.next().toUpperCase().charAt(0);

                double orderAmount = prices[item-1] * qty;
                double deduction = 0;

                if (student == 'Y' && orderAmount >= 500) {
                    deduction = orderAmount * 0.15;
                } else if (student == 'Y') {
                    deduction = orderAmount * 0.10;
                } else if (orderAmount >= 500) {
                    deduction = orderAmount * 0.05;
                }

                double orderTotal = orderAmount - deduction;

                // Update totals
                totalQuantity += qty;
                totalBeforeDeduction += orderAmount;
                totalDeduction += deduction;

                // Summary of Order
                System.out.printf("%nSubtotal: $%.2f%n", orderAmount);
                System.out.printf("Discount: $%.2f%n", deduction);
                System.out.printf("Order total: $%.2f%n%n", orderTotal);
            }

            // Anything else you would like to order?
            System.out.print("Do you want to order again? (Y/N): ");
            char again = sc.next().toUpperCase().charAt(0);
            if (again == 'N') break;
            System.out.println();
        }

        // Checkout
        double finalAmount = totalBeforeDeduction - totalDeduction;
        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Total items: " + totalQuantity);
        System.out.printf("Total before discount: $%.2f%n", totalBeforeDeduction);
        System.out.printf("Total discount: $%.2f%n", totalDeduction);
        System.out.printf("Final amount: $%.2f%n", finalAmount);
        System.out.println("Thank you for ordering!");
    }
}
=======
import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {
            "Chicken Adobo with Rice",
            "Fried Chicken with Rice",
            "Chicken Sopas",
            "4pc Siomai",
            "Filipino-style Spaghetti",
            "Carbonara",
            "Banana Cue",
            "Extra Rice",
            "Gulaman drink",
            "Four Seasons drink"
        };

        double[] prices = {
            120,  // Chicken Adobo with Rice
            110,  // Fried Chicken with Rice
            40,   // Chicken Sopas
            25,   // 4pc Siomai
            80,   // Filipino-style Spaghetti
            80,   // Carbonara
            25,   // Banana Cue
            20,   // Extra Rice
            20,   // Gulaman drink
            20    // Four Seasons drink
        };

        int totalQuantity = 0;
        double totalBeforeDeduction = 0;
        double totalDeduction = 0;

        while (true) {
            // Displaying Menu
            System.out.println("=====   M E N U   =====");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%d. %-25s - $%.2f%n", (i+1), items[i], prices[i]);
            }

            // Input of user or customer
            System.out.print("\nEnter item number: ");
            int item = sc.nextInt();
            System.out.print("Enter quantity (1-10): ");
            int qty = sc.nextInt();

            // Validation of inputs
            if (item < 1 || item > items.length || qty < 1 || qty > 10) {
                System.out.println("\nInvalid order! Please enter a valid item and quantity.\n");
            } else {
                System.out.print("Are you a student? (Y/N): ");
                char student = sc.next().toUpperCase().charAt(0);

                double orderAmount = prices[item-1] * qty;
                double deduction = 0;

                if (student == 'Y' && orderAmount >= 500) {
                    deduction = orderAmount * 0.15;
                } else if (student == 'Y') {
                    deduction = orderAmount * 0.10;
                } else if (orderAmount >= 500) {
                    deduction = orderAmount * 0.05;
                }

                double orderTotal = orderAmount - deduction;

                // Update totals
                totalQuantity += qty;
                totalBeforeDeduction += orderAmount;
                totalDeduction += deduction;

                // Summary of Orders
                System.out.printf("%nSubtotal: $%.2f%n", orderAmount);
                System.out.printf("Discount: $%.2f%n", deduction);
                System.out.printf("Order total: $%.2f%n%n", orderTotal);
            }

            // Anything else you woul like to order?
            System.out.print("Do you want to order again? (Y/N): ");
            char again = sc.next().toUpperCase().charAt(0);
            if (again == 'N') break;
            System.out.println();
        }

        // Checkout
        double finalAmount = totalBeforeDeduction - totalDeduction;
        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Total items: " + totalQuantity);
        System.out.printf("Total before discount: $%.2f%n", totalBeforeDeduction);
        System.out.printf("Total discount: $%.2f%n", totalDeduction);
        System.out.printf("Final amount: $%.2f%n", finalAmount);
        System.out.println("Thank you for ordering!");
    }
}
>>>>>>> f348d5bb430a0f38f2a8545cea968de418fde01b
