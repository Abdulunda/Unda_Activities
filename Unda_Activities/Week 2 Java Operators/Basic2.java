import java.util.Scanner;
public class Basic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("\nResults:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulo: " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulo: Cannot divide by zero");
        }

        // Division and modulo with negative operands follow Java's rules.
        input.close();
    }
}
