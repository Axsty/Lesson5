package se.iths.axel.lesson5;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Car("Volvo", "Green", 10000);

        Car tesla = new Car("Tesla", "Black", 600000);

        Car saab = new Car("Saab", "Red", 15000);

        volvo.printInfo();

        saab.printInfo();

        tesla.printInfo();
    }
}