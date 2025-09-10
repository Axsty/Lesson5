package se.iths.axel.lesson5.switchexercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tryck 1 för att spela, 2 för att se statistik, " +
                "3 för att avsluta.");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Du valde att spela");
                break;
            case "2":
                System.out.println("Du valde att se din statistik");
                break;
            case "3":
                System.out.println("Du valde att avsluta");
                break;
            default:
                System.out.println("Fel val");
        }
    }
}
