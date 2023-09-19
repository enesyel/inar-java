import java.util.Scanner;

public class A08_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
       isPalindrome(number);

    }


    public static void isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        int k;
        while (number != 0) {
            k = number % 10;
            reversedNumber = reversedNumber * 10 + k;
            number /= 10;


        }
        if (originalNumber == reversedNumber)
            System.out.println(originalNumber + " is a palindrome. ");
        else
            System.out.println(originalNumber + " is not a palindrome. ");

    }
}
