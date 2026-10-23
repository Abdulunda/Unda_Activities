import java.util.Arrays;
public class Advanced5 {
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};
        int target = 92;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found.");
        }

        // Make a copy before sorting
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the copy
        Arrays.sort(sortedScores);

        System.out.println("Original array: " + Arrays.toString(scores));
        System.out.println("Sorted array: " + Arrays.toString(sortedScores));

        /* Sorting a copy keeps the original array unchanged,
         which matters if we still need the original order later.*/
    }
}
