import java.util.Scanner;

public class A05_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctcount = 0;
        int wrongcount = 0;
        for (int i = 0; i < 10; i++) {
            int num3 = (int) (Math.random() * 15);
            int num4 = (int) (Math.random() * 15);
            System.out.println("What is " + num3 + " + " + num4 + " ? ");
            int answer = input.nextInt();

            if (answer == num3 + num4) {
                System.out.println("You are correct ! ");
                correctcount++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(num3 + " + " + num4 + " should be " + (num3 + num4));
                wrongcount++;


            }


        }
        System.out.println("Correct acount is : " + correctcount);
        System.out.println("Wrong acount is : " + wrongcount);
    }
}
