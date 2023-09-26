import java.util.Scanner;

public class A08_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = number % 10;
            number /= 10;


            System.out.print(reversed);
            if (number / 10 == 0)
                break;
        }
        return number;
    }
}
