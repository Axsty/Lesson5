package se.iths.axel.lesson5;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Car("Volvo", "Green", 10000);

        Car tesla = new Car("Tesla", "Black", 600000);

        Car saab = new Car("Saab", "Red", 15000);

        volvo.printInfo();

        saab.printInfo();

        tesla.printInfo();

        Student student1 = new Student("Axel", "Male", 26, 4);

        Student student2 = new Student("Philip", "Male", 25, 3.4);

        Student student3 = new Student("Molly", "Female", 24, 4.2);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}