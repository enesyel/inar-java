import java.util.Scanner;

public class A5_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles               Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "                   " + (i * 1.609));
        }
    }
}
