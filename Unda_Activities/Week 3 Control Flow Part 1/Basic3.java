import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Grade: ");
        int num1 = input.nextInt();
        
        if (num1 >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
