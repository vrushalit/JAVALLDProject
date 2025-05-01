package LLDSolidPrinciples;

public class PaymentProcessor {
    private final int pricePerItem;

    PaymentProcessor(int pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public int processPayment(FoodOrder order){
        int payment = order.getQuantity() * pricePerItem;

        return payment;
    }
}
