package Decorator;

public class WhippedCream extends Addons{
    Beverage beverage;

    public WhippedCream(Beverage beverage){
        this.beverage = beverage; 
    }

    public int getCost(){
        return beverage.getCost() + 20;
    }

    public String getDescription(){
        String desc = "added Milk";
        return beverage.getDescription() + desc;
    }
}
