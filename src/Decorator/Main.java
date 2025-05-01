package Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new PlainCoffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost());
    }
}
