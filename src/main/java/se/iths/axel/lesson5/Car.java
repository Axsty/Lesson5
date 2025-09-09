package se.iths.axel.lesson5;

public class Car {

    private String brand;
    private String color;
    private double price;

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 10000) {
            System.out.println("För lågt pris!");
        } else {
            this.price = price;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
