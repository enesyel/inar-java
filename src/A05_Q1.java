import java.util.Scanner;

public class A05_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, (the input ends if it is 0) : ");
        int data = input.nextInt();
        int sum, positive, negative;
        double average;
        int count = 0;
        int countnegative = 0;
        int countpositive = 0;
        for (sum = 0; data != 0; data = input.nextInt()) {
            sum += data;
            System.out.print("Enter an integer, (the input ends if it is 0) : ");
            count++;
            if (data < 0) {
                countnegative++;
            } else {
                countpositive++;
            }
        }
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + sum / count);
        System.out.println("The number of positives is : " + countpositive);
        System.out.println("The number of negatives is : " + countnegative);
    }
}
