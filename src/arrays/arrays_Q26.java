package arrays;

import java.util.Scanner;

public class arrays_Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 :");
        int n = input.nextInt();
        int[] list1 = new int[n];
        for (int j = 0; j < n; j++) {
            list1[j] = input.nextInt();
        }
        System.out.print("Enter list2 : ");
        int m = input.nextInt();
        int[] list2 = new int[m];
        for (int i = 0; i < m; i++) {
            list2[i] = input.nextInt();
        }
        equals(list1, list2);
    }

    public static void equals(int[] list1, int[] list2) {
        int count = 0;
        for (int i = 0; i < list1.length; i++) {

            if (list1[i] == list2[i]) {
                count++;


            }

        }
        if (count == list1.length) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }
}
