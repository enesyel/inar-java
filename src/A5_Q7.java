import java.util.Scanner;

public class A5_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialTuition = 10000;
        final double rateOfIncrease = 0.05;
        double totalCost = 0;

        for (int year = 1; year <= 10; year++) {
            initialTuition += initialTuition * rateOfIncrease;
            if (year > 10) {
                totalCost += initialTuition;
            }

        }

        System.out.println("The tuition in ten years will be: $" + initialTuition);
        System.out.println("The total cost of four years' worth of tuition after the tenth year will be: $" + totalCost);


    }
}
