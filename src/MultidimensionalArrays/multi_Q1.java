package MultidimensionalArrays;

import java.util.Scanner;

public class multi_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();

            }

        }
        sumColumn(m);


    }

    public static double sumColumn(double[][] m) {

        double sum=0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += m[j][i];

            }
            System.out.println("Sum of the element at column " + i + " is " + sum);


        }
        return sum;

    }
}
