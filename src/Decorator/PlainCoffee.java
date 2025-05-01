package Decorator;

public class PlainCoffee implements Beverage{
    int cost = 50;
    String description = "Plain Coffee ";

    @Override
    public int getCost(){
        return cost;
    }

    @Override
    public String getDescription(){
        return description;
    }
}
