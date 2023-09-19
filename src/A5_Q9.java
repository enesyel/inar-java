import java.util.Scanner;

public class A5_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int score;
        int highestScore = 0;
        int secongHighestScore = 0;
        String StudentWithHighestScore = "";
        String StudentWithSecondHighestScore = "";
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Student " + i + "\nName : ");
            name = input.next();
            System.out.print("Score : ");
            score = input.nextInt();
            if (score > highestScore) {
                secongHighestScore = highestScore;
                StudentWithSecondHighestScore = StudentWithHighestScore;
                highestScore = score;
                StudentWithHighestScore = name;

            } else if (score > secongHighestScore) {
                secongHighestScore = score;
                StudentWithSecondHighestScore = name;
            }

        }
        System.out.print("The highest scoring student : " + StudentWithHighestScore);
        System.out.print("\nThe second highest scoring student : " + StudentWithSecondHighestScore);


    }
}
