
public class Advanced2 {
     public static void main(String[] args) {

        // Starting balance
        double balance = 1000;

        // Step 1: Add 10%
        balance += 100;
        System.out.println("After step 1: " + balance);

        // Step 2: Multiply by 1.05 (5% growth)
        balance *= 1.05;
        System.out.println("After step 2: " + balance);

        // Step 3: Add 200
        balance += 200;
        System.out.println("After step 3: " + balance);

        // Prefix and postfix increment
        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("Count after postfix: " + count);

        count = 5;

        System.out.println("Prefix: " + ++count);
        System.out.println("Count after prefix: " + count);

        // The postfix count++ prints the current value first, then increases it.
        // The prefix ++count increases the value first, then prints the new value.
    }
}
