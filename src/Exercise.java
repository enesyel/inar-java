import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of balls : ");
        int numberOfBalls = input.nextInt();
        System.out.println("Please enter the number of slots : ");
        int numberOfSlots = input.nextInt();
        String[] droppings = new String[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            droppings[i] = dropTheBall(numberOfSlots);

        }
        int[] slotArray = fillTheSlots(droppings, numberOfSlots);
    }

    private static int[] fillTheSlots(String[] droppings, int numberOfSlots) {
        int[] slotArray = new int[numberOfSlots];
        for (int i = 0; i < droppings.length; i++) {
            int index = 0;
            for (int j = 0; j < droppings[i].length(); j++) {


            }
            slotArray[index]++;


        }
        return slotArray;
    }

    private static String dropTheBall(int numberOfSlots) {
        String dropping = " ";
        for (int i = 0; i < numberOfSlots; i++) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                dropping += "R";
            } else {
                dropping += "L";
            }
            return dropping;


        }
        return dropping;
    }

    public static void drawTheSlots() {

    }

    public static void calculatePosibilities() {

    }

    public static void calculateSlots() {

    }
}
