import java.util.Scanner;

public class A5_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int score;
        int highestScore = 0;
        String StudentWithHighestScore = "";
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Student : " + i + "\nName : ");
            name = input.next();
            System.out.print("Score : ");
            score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
                StudentWithHighestScore = name;
            }


        }
        System.out.print("Student with hisghest score : " + StudentWithHighestScore);


    }
}
