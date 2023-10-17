import java.util.Scanner;

public class A08_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = input.nextInt();
        displayPattern(n);

    }

    public static int displayPattern(int n) {
        for (int i = 1; i <= n; i--) {
            for (int k = 1; k <=i ; k++) {
                System.out.printf("%5d", k);
            }
            System.out.println();
        }
        return n;
    }
}
