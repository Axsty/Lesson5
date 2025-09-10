package se.iths.axel.lesson5;

import java.util.Random;
import java.util.Scanner;

public class PlayerMain {

    public static void main(String[] args) {
        Player player = new Player();

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        while (true) {
            System.out.print("Mata in ditt namn: ");
            String name = scanner.nextLine();
            player.setName(name);
            System.out.print("Tryck enter för att slå tärningen! ");
            scanner.nextLine();
            int diceThrow = random.nextInt(1, 11);
            player.setScore(diceThrow);
            System.out.println("Du fick: " + player.getScore());
            player.setScore(0);
        }

    }
}
