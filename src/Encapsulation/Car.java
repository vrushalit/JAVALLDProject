package Encapsulation;

public class Car {
    private String model;
    private String color;
    private String brand;

    private int year;
    private int speed;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    } 

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increment(int increment){
        speed += increment;
    }

    public void decrement(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
    }
}
