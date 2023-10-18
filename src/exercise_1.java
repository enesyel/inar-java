import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Write a Java program to find and print the sum of all elements in a 2D array.

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }

        }
        System.out.println("Total : "+sum);

    }
}
