package MultidimensionalArrays;

import java.util.Scanner;

public class multi_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        sumMajorDiagonal(m);

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum1 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += m[i][i];
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum1);


        return sum1;
    }
}
