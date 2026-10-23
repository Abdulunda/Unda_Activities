
public class Expert5 {
    
    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int total = 0;

            for (int score : quizzes) {
                total += score;
            }

            return (double) total / quizzes.length;
        }
    }

    public static void main(String[] args) {

        int[][] rawQuizData = {
            {85, 90, 88, 92},
            {78, 82, 80, 85},
            {95, 90, 94, 96},
            {88, 88, 88, 88},
            {95, 90, 94, 96}
        };

        String[] names = {
            "Alice",
            "Josh",
            "Gonzales",
            "David",
            "Ella"
        };

        Student[] students = new Student[rawQuizData.length];

        for (int i = 0; i < rawQuizData.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage() < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("===== CLASS LEADERBOARD =====");

        for (int i = 0; i < students.length; i++) {
            System.out.printf(
                "%d. %s - Average: %.2f%n",
                i + 1,
                students[i].name,
                students[i].getAverage()
            );
        }

        String searchName = "Gonzales";
        int foundIndex = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(searchName)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(searchName + " is ranked #" + (foundIndex + 1));
        } else {
            System.out.println(searchName + " was not found.");
        }
    }
}
