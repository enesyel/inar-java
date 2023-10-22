package arrays;

import java.util.Scanner;

public class arrays_Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter a,b,c : ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();

        }
        solveQuadratic(eqn, roots);
        double disc = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);
        if (disc > 0) {
            System.out.println("The number of real roots : 2");
            System.out.print("The root(s) of equation : ");
            for (int i = 0; i < roots.length; i++) {
                System.out.print(roots[i] + " ");

            }
        } else if (disc == 0) {
            System.out.println("The number of real root : 1");
        } else {
            System.out.println("The equation has no real root.");
        }

    }

    public static double[] solveQuadratic(double[] eqn, double[] roots) {

        double disc = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);
        double r1 = (-eqn[1] + (Math.sqrt(disc))) / (2 * eqn[0]);
        double r2 = (-eqn[1] - (Math.sqrt(disc))) / (2 * eqn[0]);
        roots[0] = r1;
        roots[1] = r2;
        return roots;
    }
}
