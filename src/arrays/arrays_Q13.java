package arrays;

import java.util.Scanner;

public class arrays_Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers to exclude from random (1-54) : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        getRandom(numbers);
        System.out.println("Number generated : " + getRandom(numbers));
    }

    public static int getRandom(int[] numbers) {
        int random = (int) (Math.random() * 54);
        int randomNumber = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != random) {
               randomNumber=random;

            }
        }
        return randomNumber;
    }
}
