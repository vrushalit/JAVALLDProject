package LLDSolidPrinciples;

public class PercentageDiscount implements DiscountStrategy{
    private int percentage;
    public PercentageDiscount(int percentage){
        this.percentage = percentage;
    }

    @Override
    public int applyDiscount(int amount){
        return amount - (amount * percentage/100);
    }
}
