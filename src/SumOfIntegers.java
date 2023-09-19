import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        int toplam = sum(number);
        System.out.println(toplam);
    }

    public static int sum(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += i;
        }
        return sum;
    }
}
