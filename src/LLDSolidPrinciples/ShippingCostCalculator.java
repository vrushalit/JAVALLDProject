package LLDSolidPrinciples;
import LLDSolidPrinciples.Strategy.ShippingStrategy;

public class ShippingCostCalculator {
    private ShippingStrategy strategy;

    ShippingCostCalculator(ShippingStrategy strategy){
        this.strategy = strategy;
    }

    public int calculateShipping(FoodOrder order){
        return strategy.calculateShippingCost(order);
    }
}
