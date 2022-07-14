public class InventoryController {

    import java.util.*;

    private Scanner keyboard = new Scanner(System.in);
    private DBHandler handler = new DBhandler();

    public void addItem(){

        System.out.print("Enter Item ID: ");
        int item_id = keyboard.nextInt();
        System.out.print("Enter Item Name: ");
        String item_name = keyboard.nextline();
        System,.out.print("Enter Quantity:");
        int quantity = keyboard.nextInt();
        System.out.print("Enter Price:");
        double price = keyboard.nextDouble();

        Item item = new Item(item_id, item_name, quantity, price);

        if(handler.insertItem(item))
        {
            System.out.println("Item Saved");
        }else
        {
            System.out.println("Failed To Save");
        }




}
