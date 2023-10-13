import java.util.Scanner;

import static java.util.Collections.swap;

public class arrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5};
        print(list);
        list = reverse(list);
        System.out.println("-----------");
        print(list);

    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];

        }
        return result;

    }

    public static void print(int[] array) {
        for (int number : array) {
            System.out.println(number);


        }
    }
}
