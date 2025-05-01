package LLDSolidPrinciples;

public class NoDiscount implements DiscountStrategy{
    public int applyDiscount(int amount){
        return amount;
    }
}
