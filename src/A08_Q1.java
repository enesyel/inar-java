import java.util.Scanner;

public class A08_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The first 100 pentagonal numbers, ten per line : ");
        getPentagonalNumber(1, 100);

    }

    public static int getPentagonalNumber(int number1, int number2) {
        int PentagonalNumber = 0;
        int count = 0;
        for (int i = number1; i <= number2; i++) {

            PentagonalNumber = i * ((3 * i) - 1) / 2;
            System.out.printf("%6d",PentagonalNumber);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }

        }
        return PentagonalNumber;
    }


}
