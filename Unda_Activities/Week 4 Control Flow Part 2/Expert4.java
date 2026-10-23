import java.util.Scanner;
public class Expert4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] warehouse = {
            {10, 20, -1, 15},
            {5, -1, 30, 8},
            {12, 4, 7, -1}
        };

        int choice;

 
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Calculate Total Inventory");
            System.out.println("3. Find Low Stock Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            System.out.print(warehouse[row][col] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total inventory: " + total);
                    break;

                case 3:
                    boolean found = false;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] != -1 &&
                                warehouse[row][col] < 10) {

                                System.out.println(
                                    "First critically low shelf: Row "
                                    + row + ", Column " + col
                                    + " (" + warehouse[row][col] + " items)"
                                );

                                found = true;
                                break;
                            }
                        }

                        if (found) {
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No critically low shelf found.");
                    }

                    break;

                case 4:
                    restockShelf(warehouse, input);
                    break;

                case 5:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }

    public static void restockShelf(int[][] warehouse, Scanner input) {

        int row;

        System.out.print("Enter row (0-2): ");
        row = input.nextInt();

        while (row < 0 || row >= warehouse.length) {
            System.out.print("Invalid row. Enter again: ");
            row = input.nextInt();
        }

        int col;

        System.out.print("Enter column (0-3): ");
        col = input.nextInt();

        while (col < 0 || col >= warehouse[row].length) {
            System.out.print("Invalid column. Enter again: ");
            col = input.nextInt();
        }

        if (warehouse[row][col] == -1) {
            System.out.println("Cannot restock. This shelf is damaged.");
            return;
        }

        int amount;

        System.out.print("Enter restock amount: ");
        amount = input.nextInt();

        while (amount <= 0) {
            System.out.print("Amount must be greater than 0. Enter again: ");
            amount = input.nextInt();
        }

        warehouse[row][col] += amount;

        System.out.println("Shelf successfully restocked.");
        System.out.println("New quantity: " + warehouse[row][col]);
    } 
}
