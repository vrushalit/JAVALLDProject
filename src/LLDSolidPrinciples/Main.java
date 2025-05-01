package LLDSolidPrinciples;

import LLDSolidPrinciples.Strategy.ShippingStrategy;
import LLDSolidPrinciples.Strategy.StandardShipping;
import LLDSolidPrinciples.Strategy.FreeShipping;
import LLDSolidPrinciples.Strategy.PrimeShipping;




import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder(List.of("Pizza", "Pasta", "Cola"), 3, 450);


        ShippingStrategy standard = new StandardShipping(50);

        ShippingStrategy free = new FreeShipping();

        ShippingStrategy prime = new PrimeShipping(20);


        ShippingCostCalculator calculator;

        calculator = new ShippingCostCalculator(standard);
        System.out.println("Standard Shipping: ₹" + calculator.calculateShipping(order));

        calculator = new ShippingCostCalculator(free);
        System.out.println("Free Shipping: ₹" + calculator.calculateShipping(order));

        calculator = new ShippingCostCalculator(prime);
        System.out.println("Prime Shipping: ₹" + calculator.calculateShipping(order));

    }
}
