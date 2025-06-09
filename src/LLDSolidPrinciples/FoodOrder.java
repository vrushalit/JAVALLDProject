package LLDSolidPrinciples;

import java.util.List;

public class FoodOrder {
    private List<String> items;
    private int quantity;
    private int total;

    public FoodOrder(List<String> items, int quantity, int total) {
        this.items = items;
        this.quantity = quantity;
        this.total = total;
    }

    // Getters
    public List<String> getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return total;
    }

}
