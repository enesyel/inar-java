import java.util.Scanner;

public class arrays_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ten numbers : ");
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        smalletsElement(array);
        indexOfSmallestElement(array);


        System.out.println("The minimum number is " + smalletsElement(array) + " index " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        double mini = array[0];
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mini) {
                mini =  array[i];
                index = i;
            }


        }
        return index;
    }

    public static double smalletsElement(double[] array) {
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }
}
