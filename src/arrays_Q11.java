import java.util.Scanner;

public class arrays_Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] x = new double[10];
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
        }
        deviation(x);
        mean(x);
        System.out.println("The mean is : " + mean(x));
        System.out.print("The standard deviation is : " + deviation(x));

    }

    public static double deviation(double[] x) {
        double sum2 = 0;
        double devi ;
        double a;
        for (int i = 0; i < x.length; i++) {
            double k = Math.pow((x[i] - mean(x)), (x[i] - mean(x)));
            sum2+=k;
        }
        a = sum2 / (x.length - 1);
        devi = Math.sqrt(a);

        return devi;
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];

        }
        double mean = (sum / x.length);
        return mean;
    }
}
