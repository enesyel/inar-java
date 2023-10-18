import java.util.Scanner;

public class arrays_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        int[] counts = new int[10];
        for (int number : numbers) {
            counts[number]++;
        }

        System.out.println("Counts for each number:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
