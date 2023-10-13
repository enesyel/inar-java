import java.util.Scanner;

public class A5_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items : ");
        int n = input.nextInt();
        int[] number = new int[n];
        int sum = 0;
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
            sum += number[i];
        }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > average) {
                count++;
            }

        }
        System.out.println("Average : " + average);
        System.out.println("Number of elements above the average is : " + count);


    }
}