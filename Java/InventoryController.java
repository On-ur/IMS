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
private void deleteItem(){
        System.out.println("Enter Item ID: ");
        id = keyboard.netInt();

        if(handler.deleteItem(id)){
            System.out.println("Item With ID " + id + " Has Been Deleted.");
        }else {
            System.out.println("Failed To Delete Item");
        }
}

    /**
     * Display a menu to the user
     *
     * @return choice
     */

public int menu(){
    System.out.println("IMS - Inventory Management System");
    System.out.println("1- Add New Item");
    System.out.println("2- Delete An Item");
    System.out.println("3- Update An Item");
    System.out.println("4- Display All Items");
    System.out.println("5- Exit Application");

    int choice;
    do{
        System.out.print("Choose An Option: ");
        choice = keyboard.nextInt();

    }

    }while(choice <1 || choice >5);

    return choice;

}

pubic void runApp(){

    int choice;

    do{
        choice = menu();
        System.out.println();

        if(choice == 1){
        addItem();

        }else if(choice == 2){
            deleteItem();
        }else if(choice = 3){
            updateItem();

        }else if(choice = 4){

        }
        System.out.println();


        }while(choice != 5);
















