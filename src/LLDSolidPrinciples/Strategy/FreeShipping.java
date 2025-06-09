package LLDSolidPrinciples.Strategy;

import LLDSolidPrinciples.FoodOrder;

public class FreeShipping implements ShippingStrategy{
    @Override
    public int calculateShippingCost(FoodOrder order){
        return 0;
    }
}
