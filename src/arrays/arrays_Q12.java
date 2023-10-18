package arrays;

import java.util.Scanner;

public class arrays_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        reverse(array);

    }

    public static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {

            reverseArray[i] = array[i];
        }
        for (int i = reverseArray.length-1; i >= 0; i--) {

            System.out.print(reverseArray[i] + " ");
        }


    }
}
