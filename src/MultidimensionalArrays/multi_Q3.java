package MultidimensionalArrays;

import java.util.Scanner;

public class multi_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] kb = new int[8];
        int[] sn = new int[8];
        char[][] m =
                {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < 8; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if (m[i][j] == key[j]) {
                    count++;
                }


            }
            kb[i] = count;
            sn[i] = count;


        }
        int temp;
        for (int i = 0; i < kb.length; i++) {
            for (int j = i + 1; j < kb.length; j++) {
                if (kb[j] < kb[i]) {
                    temp = kb[i];
                    kb[i] = kb[j];
                    kb[j] = temp;

                }


            }

        }
        for (int i = 0; i < kb.length; i++) {

                System.out.println("Student " + sn[i] + "'s correct count is " + kb[i]);
            }

        }

    }

