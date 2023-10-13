import java.util.Scanner;

public class arrays_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter " + numberOfStudents + " scores : ");
        int bestScore = -1;
        int[] score = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            score = new int[]{input.nextInt()};
            if (score[i] > bestScore) {bestScore = score[i];}
        }
        System.out.println("bestcore is "+ bestScore);
        for (int i = 0; i < numberOfStudents; i++) {
            if (score[i] >= bestScore - 10) {
                System.out.println("Student " + i + " score is " + score[i] + " A");
            } else if (score[i] >= bestScore - 20) {
                System.out.println("Student " + i + " score is " + score[i] + " B");
            } else if (score[i] >= bestScore - 30) {
                System.out.println("Student " + i + " score is " + score[i] + " C");
            } else if (score[i] >= bestScore - 40) {
                System.out.println("Student " + i + " score is " + score[i] + " D");
            } else {
                System.out.println("Student " + i + " score is " + score[i] + " F");

            }


        }
    }
}



