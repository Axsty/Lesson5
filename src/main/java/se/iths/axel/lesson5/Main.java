package se.iths.axel.lesson5;

public class Main {
    public static void main(String[] args) {

        BankAccount1 bankAccount = new BankAccount1(12334, 0);

        bankAccount.getBalance();
        bankAccount.setBalance(1400);
        bankAccount.deposit(bankAccount.getBalance());
        bankAccount.printInfo();





        /* Student student1 = new Student("Axel", 43213, 4);
        student1.getGrade(10.2);
        student1.printInfo();

        Student student2 = new Student("Niklas", 54692, 4);
        student2.getGrade(2.3);
        student2.printInfo();

        Student student3 = new Student("Peter", 11149, 4);
        student3.getGrade(6.4);
        student3.printInfo();

        Rectangle rectangle = new Rectangle(6, 6);

        rectangle.areaRectangle();

         Rectangle rectangle = new Rectangle();

        double width1 = rectangle.getWidth();
        rectangle.setWidth(4);
        double height1 = rectangle.getHeigth();
        rectangle.setHeigth(4);

        double width2 = rectangle.getWidth();
        rectangle.setWidth(10);
        double height2 = rectangle.getHeigth();
        rectangle.setHeigth(2);


        System.out.println("The area of the first rectangle is: " + rectangle.getWidth() * rectangle.getHeigth());
        System.out.println("The area of the second rectangle is: " + height2 * width2);






       /* Person person = new Person();

        String name = person.getName();
        person.setName("Niklas");

        int age = person.getAge();
        person.setAge(36);

        String city = person.getCity();
        person.setCity("Karlstad");


        person.introduce(person.getName(), person.getAge(), person.getCity());



       /* Car volvo = new Car("Volvo", "Green", 10000);
        String brand = volvo.getBrand();
        String color = volvo.getColor();
        double price = volvo.getPrice();
        System.out.println(price);
        volvo.setPrice(11000);

        System.out.println(volvo.getPrice());


        System.out.println(brand);

        Car tesla = new Car("Tesla", "Black", 600000);
        Car saab = new Car("Saab", "Red", 15000);

        volvo.printInfo();
        saab.printInfo();
        tesla.printInfo();

        // Student student1 = new Student("Axel", "Male", 26, 4);
        // Student student2 = new Student("Philip", "Male", 25, 3.4);
        // Student student3 = new Student("Molly", "Female", 24, 4.2);

        // student1.printInfo();
        //  student2.printInfo();
        // student3.printInfo(); */
    }
}