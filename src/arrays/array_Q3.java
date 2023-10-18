import java.util.Scanner;

public class array_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        printTers(list);

    }

    private static void printTers(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");

        }
    }
}
