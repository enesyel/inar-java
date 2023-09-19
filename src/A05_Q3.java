import java.util.Scanner;

public class A05_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilograms       Pounds ");
        for (int i = 1; i < 200; i += 2) {
            System.out.println(i + "               " +(i * 2.2));
        }
    }
}
