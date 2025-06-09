package Decorator;

public class Milk extends Addons{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage; 
    }

    public int getCost(){
        return beverage.getCost() + 15;
    }

    public String getDescription(){
        String desc = "added Milk";
        return beverage.getDescription() + desc;
    }
}
