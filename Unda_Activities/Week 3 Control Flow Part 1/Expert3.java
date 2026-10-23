import java.util.Scanner;
public class Expert3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        int correctPin = 1234;

        double balance = 100000;
        double withdrawal;
        String tier = "";
        double dailyLimit = 0;
        double feeRate = 0;

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter 4-digit PIN: ");
        int pin = input.nextInt();

        if (username.equals(correctUsername)) {

            if (pin == correctPin) {

                System.out.print("Enter withdrawal amount: ");
                withdrawal = input.nextDouble();

                if (balance >= 20000) {
                    tier = "Platinum";
                    dailyLimit = 10000;
                } else if (balance >= 10000) {
                    tier = "Gold";
                    dailyLimit = 5000;
                } else if (balance >= 5000) {
                    tier = "Silver";
                    dailyLimit = 3000;
                } else {
                    tier = "Bronze";
                    dailyLimit = 1000;
                }

                switch (tier) {
                    case "Platinum":
                        feeRate = 0.01;
                        break;
                    case "Gold":
                        feeRate = 0.015;
                        break;
                    case "Silver":
                        feeRate = 0.02;
                        break;
                    case "Bronze":
                        feeRate = 0.025;
                        break;
                }

                double fee = withdrawal * feeRate;
                double totalAmount = withdrawal + fee;

                // Nested if: check balance AND daily limit
                if (withdrawal <= balance) {

                    if (withdrawal <= dailyLimit) {

                        if (totalAmount <= balance) {
                            System.out.println("\nTransaction APPROVED");
                            System.out.println("Account Tier: " + tier);
                            System.out.println("Withdrawal: " + withdrawal);
                            System.out.println("Transaction Fee: " + fee);
                            System.out.println("Total Deducted: " + totalAmount);
                            System.out.println("Remaining Balance: " + (balance - totalAmount));
                        } else {
                            System.out.println("\nTransaction DENIED");
                            System.out.println("Reason: Insufficient balance after including the transaction fee.");
                        }

                    } else {
                        System.out.println("\nTransaction DENIED");
                        System.out.println("Reason: Withdrawal exceeds the " + tier + " daily limit of " + dailyLimit + ".");
                    }

                } else {
                    System.out.println("\nTransaction DENIED");
                    System.out.println("Reason: Insufficient balance.");
                }

            } else {
                System.out.println("\nTransaction DENIED");
                System.out.println("Reason: Incorrect PIN.");
            }

        } else {
            System.out.println("\nTransaction DENIED");
            System.out.println("Reason: Incorrect username.");
        }

        input.close();
    }
}
