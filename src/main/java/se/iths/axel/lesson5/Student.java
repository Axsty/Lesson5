package se.iths.axel.lesson5;

public class Student {
    private String name;
    private int studentId;
    private double grade;

    public Student(String name, int studentId, double grqde) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;

    }

    public double setGrade() {
        return grade;
    }

    public void getGrade(double grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("StudentID: " + studentId);
        System.out.println("Grade: " + grade);
    }

}
