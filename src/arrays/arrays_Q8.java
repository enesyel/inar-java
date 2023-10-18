import java.util.Scanner;

public class arrays_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten values of double type : ");

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        printAverage(array);
        System.out.println("The average value : " + printAverage(array));

    }

    public static double printAverage(double[] array) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        average = sum / array.length;
        return average;
    }
}
