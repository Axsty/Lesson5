package se.iths.axel.lesson5;

public class Person {
    private String name;
    private int age;
    private String city;

    public void introduce(String name, int age, String city) {
        System.out.println("Hej, jag heter " + name + " jag är " + age + "år och bor i " + city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
