package arrays;

import java.util.Scanner;

public class arrays_Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
    }

    public static double[] sort(double[] number) {
        double temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }

            }

        }
        return number;
    }
}
