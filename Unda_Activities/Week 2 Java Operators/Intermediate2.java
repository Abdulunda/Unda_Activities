import java.util.Scanner;
public class Intermediate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter student's average grade: ");
        double average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        boolean passed = (average >= 75 && absences <= 3) || average >= 90;

        if (passed) {
            System.out.println("PASS");
            
            if (average >= 90) {
                System.out.println("Reason: Average is 90 or higher.");
            } else {
                System.out.println("Reason: Average is 75 or higher and absences are 3 or fewer.");
            }
        } else {
            System.out.println("FAIL");
            System.out.println("Reason: Average is below 75 or absences are more than 3.");
        }

        input.close();
    }
}
