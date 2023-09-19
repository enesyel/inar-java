import java.util.Scanner;

public class A5_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles          Kilometers   |   Kilometers          Miles");
        double ex=2.2;
        for (int i = 1, j=20; i<200&&j<=515;i+=2,j+=5){
            System.out.printf("%-15d%-13.3f%s", i, i * ex, "|   ");
            System.out.printf("%-20d%.3f", j, j / ex);
            System.out.println();

        }
    }
}
