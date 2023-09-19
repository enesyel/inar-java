import java.util.Scanner;

public class A08_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int integer = input.nextInt();
        System.out.print("The sum of the digits : " + sumDigits(integer));
    }

    public static int sumDigits(long sumDigitsNumber) {
        int sum = 0;
        while (sumDigitsNumber != 0) {
            sum += sumDigitsNumber % 10;
            sumDigitsNumber /= 10;

        }
        return sum;
    }
}
