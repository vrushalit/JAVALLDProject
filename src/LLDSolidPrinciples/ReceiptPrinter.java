package LLDSolidPrinciples;

public class ReceiptPrinter {
    public void printReciept(FoodOrder order){
        for(String item: order.getItems()){
            System.out.println("Item: "+item);
        }
        System.out.println("Quantity: "+order.getQuantity());
        System.out.println("Total: "+ order.getTotal());
    }
}
