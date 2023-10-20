package arrays;

import java.util.Scanner;

public class arrays_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter five numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(gcd(numbers));

    }

    public static int gcd(int[] numbers) {
        int gcd = 1;
        int k = 2;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % k == 0 ) {
                    gcd = k;
                }

            }
            k++;

        }
        return gcd;
    }
}
