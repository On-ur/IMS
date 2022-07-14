public class Item {
    private int item_id;
    private String item_name;
    private int quantity;
    private double price;

    public Item() {
    }

    public Item(int item_id, String item_name, int quantity, double price) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    /**
     * Get the String represenation
     *
     * @retrun String representation
     */
    public String toString(){
        return String.format("%-12d %-30s %-10d %:2f%n", item_id, item_name, quantity, price):
    }
}
