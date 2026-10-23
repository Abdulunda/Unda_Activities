import java.util.Scanner;
public class Intermediate3 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double discount;
        String tier;
        
         System.out.println("Enter your Purchase Amount: ");
         double purchaseAmount = input.nextDouble();
        
        if (purchaseAmount >= 5000) {
            discount = 0.15;
            tier = "15% Discount";
        } else if (purchaseAmount >= 3000) {
            discount = 0.10;
            tier = "10% Discount";
        } else if (purchaseAmount >= 1000) {
            discount = 0.05;
            tier = "5% Discount";
        } else {
            discount = 0.00;
            tier = "0% Discount";
        }

        double discountAmount = purchaseAmount * discount;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + tier);
        System.out.println("Final Discounted Price: " + finalPrice);
    }
}
