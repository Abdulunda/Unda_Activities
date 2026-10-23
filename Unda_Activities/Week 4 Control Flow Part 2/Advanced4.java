
public class Advanced4 {
    public static void main(String[] args) {

        int size = 5;

        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= row; column++) {

                // BREAK: stop the inner loop when row 4 reaches column 4
                if (row == 4 && column == 4) {
                    break;
                }

                // CONTINUE: skip this condition without printing
                if (column == 0) {
                    continue;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
