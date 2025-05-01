package LLDSolidPrinciples.Strategy;
import LLDSolidPrinciples.FoodOrder;

public interface ShippingStrategy {
    int calculateShippingCost(FoodOrder order);
}
