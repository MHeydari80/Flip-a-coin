package headsortails;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        while (true) {
            System.out.print("Heads[0] or tails[1]?\t");

            if (random.nextInt(2) == input.nextInt()) {

                score++;
                System.out.println("Right!");
                continue;
            }
            System.out.println("Wrong!");
            break;

        }

        System.out.printf("\nYou've answered %d time(s) correctly.\n\n", score);

    }

}
