package LLDSolidPrinciples.Strategy;
import LLDSolidPrinciples.FoodOrder;

public class StandardShipping implements ShippingStrategy{
    final int standardShippingCost;
    public StandardShipping(int standardShippingCost){
        this.standardShippingCost = standardShippingCost;
    }

    @Override
    public int calculateShippingCost(FoodOrder order){
        return standardShippingCost;
    }
}
