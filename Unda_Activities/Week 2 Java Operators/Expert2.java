
public class Expert2 {
   public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int num3 = 2;

        // PREDICTED: 15
        int result1 = num1 + num2 * num3 / 2;
        System.out.println("Expression 1: " + result1);

        // PREDICTED: true
        boolean result2 = num1 > num2 && num2 > num3 || num1 == 10;
        System.out.println("Expression 2: " + result2);

        // PREDICTED: 21
        int result3 = ++num1 + num2 * num3;
        System.out.println("Expression 3: " + result3);

    } 
}
