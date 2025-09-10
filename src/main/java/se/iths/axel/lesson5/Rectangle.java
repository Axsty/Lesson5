package se.iths.axel.lesson5;

public class Rectangle {

    private double width;
    private double heigth;


    //Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.heigth = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }


    //Method
    public void areaRectangle() {
        System.out.println("The area of the rectangle is: " + heigth * width);
    }


}
