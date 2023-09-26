import java.util.Scanner;

public class A08_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        double number3 = input.nextDouble();
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        displaySortedNumbers(number3, number1, number2);

    }

    public static void displaySortedNumbers(double number1, double number2, double number3) {
        double temp;
        if (number2 < number1 && number2 < number3) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        } else if (number3 < number1 && number3 < number2) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number3 < number2) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println(number1 + " " + number2 + " " + number3);

    }

}

