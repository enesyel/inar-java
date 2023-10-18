import java.util.Scanner;

public class arrayExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] chars = createArray();
        System.out.println("The lowercase letters are : ");
        displayArray(chars);
        int[] counts = countLetters(chars);
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;

        }
        return counts;

    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i]);

            }
        }
    }

    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();

        }
        return chars;
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');


    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));

    }
}
