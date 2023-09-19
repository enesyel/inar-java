import java.util.Scanner;

public class A5_Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double RATE = 1.609;
        System.out.println("Miles          Kilometers   |   Kilometers          Miles");

        for (int i = 1, y = 20; i < 10 && y < 65; i++, y += 5) {
            System.out.printf("%-15d%-13.3f%s", i, i * RATE, "|   ");
            System.out.printf("%-20d%.3f", y, y / RATE);
            System.out.println();
        }
    }
}
