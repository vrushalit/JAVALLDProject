package LLDSolidPrinciples.Strategy;

import LLDSolidPrinciples.FoodOrder;

public class PrimeShipping implements ShippingStrategy{
    final int primeShippingCost;

    public PrimeShipping(int primeShippingCost){
        this.primeShippingCost = primeShippingCost;
    }

    @Override
    public int calculateShippingCost(FoodOrder order){
        return primeShippingCost;
    }
}
