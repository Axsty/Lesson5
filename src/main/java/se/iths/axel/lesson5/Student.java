package se.iths.axel.lesson5;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double gpa;

    public Student(String name, String gender, int age, double gpa) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.gpa = gpa;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

}
