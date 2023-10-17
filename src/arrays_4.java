import java.util.Scanner;

public class arrays_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores ( negative number signifies end) : ");
        int[] scores = new int[100];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < scores.length; i++) {

            scores[i] = input.nextInt();

            if (scores[i] <= -1) {
                break;
            }
            count++;
            sum += scores[i];
        }
        int average = sum / count;

        System.out.println("Average of scores : " + average);
        int belowAverage = 0;
        int aboveAverage = 0;
        for (int i = 0; i <= scores[i]; i++) {

            if (scores[i] < average) {
                belowAverage++;
            } else {
                aboveAverage++;
            }

        }
        System.out.println("Number of scores above or equal to average : " + aboveAverage);
        System.out.println("Number of scores below average : " + belowAverage);


    }
}
