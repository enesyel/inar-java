import java.util.Scanner;

public class arrays_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] primes = new int[50];
        primes[0] = 2;
        int count = 1;
        int number = 3;
        boolean isPrime;
int account=0;
        while (count < 50) {
            isPrime = true;

            for (int i = 0; i < count; i++) {
                if (primes[i] > Math.sqrt(number)) {
                    break;
                }


                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;
            }

            number++;
        }

        System.out.println("The first 50 prime numbers are:");
        for (int prime : primes) {
            for (int i = 1; i < 50; i++) {
                account++;
                if (account%10==0){
                    System.out.println();
                }else break;

            }

            System.out.print(prime + " ");
        }
    }
}
