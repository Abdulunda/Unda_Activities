import java.util.Scanner;
public class Advanced1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter centimeters: ");
        double centimeters = input.nextDouble();

        int wholeMeters = (int) centimeters / 100;
        double remainingCentimeters = centimeters - (wholeMeters * 100);

        System.out.println("Whole meters: " + wholeMeters);
        System.out.println("Remaining centimeters: " + remainingCentimeters);

        // Implicit widening: int to double
        int number = 10;
        double widened = number;
        // No cast is needed because int can safely be converted to double.

        System.out.println("Implicit widening (int to double): " + widened);

        // Explicit narrowing: double to int
        double decimalValue = 15.75;
        int narrowed = (int) decimalValue;
        // The decimal part .75 is lost when double is narrowed to int.

        System.out.println("Explicit narrowing (double to int): " + narrowed);
    }
}
