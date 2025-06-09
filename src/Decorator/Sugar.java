package Decorator;

public class Sugar extends Addons{
    Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage = beverage; 
    }

    public int getCost(){
        return beverage.getCost() + 10;
    }

    public String getDescription(){
        String desc = "added Sugar";
        return beverage.getDescription() + desc;
    }
}
