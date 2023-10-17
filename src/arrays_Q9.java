import java.util.Scanner;

public class arrays_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }
        minNumber(numbers);
        System.out.println("The minimum number is : " + minNumber(numbers));
    }

    public static double minNumber(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;

    }
}
