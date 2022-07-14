public class DBHandler {

    import java.util.*;

    /**
     * Insert an item into the database
     * @param item
     * @return
     */

    public boolean insertItem(Item item){

        boolean result = false;

        try{

            //SQL
            String sql = "Insert into Item VALUES(?, ?, ?, ?)";
            Connection connection = DBConnection.getConnection();

            PrepareStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, item.getItem_id());
            stmt.setString(2, item.getItem_name());
            stmt.setInt(3, item.getQuantity());
            stmt.setDouble(4, item.getPrice());

            //Execute the command
            int inserted = stmt.executeUpdate();

            result = inserted >= 1;

            DBConnection.disconnect(connection);



        }catch (Exception e){
            e.printStackTrace();
        }

        return result;

    }

    /**
     * Delete an item with id
     *
     * @param id
     */
    public void deleteItem(int id){
        boolean result = false;

        try{
            String sql = "Delete From Items Where item_id = ?";
            connection conn = DBconnection.getConnection();

            PrepareStatement stmt = conn.prep
                    stmt.setInt(1, id);

            int delete = stmt.executeUpdate();

            result = delete >= 1;

            DBConnection.disconnect(conn);


        }catch(Exception e){
            ee.printStackTrace();
        }

        return result;


    }
    /**
     * Edit an item with id
     *
     * @param id
     */
    public void updateItem(Item item){
        boolean result = false;

        try{

            String sql = "Update Item, Set Quantity =?, Price=? Where ItemId=?";
            Connection conn = DBconnection.getConnection();

            PreparedStatement stmt = conn.prepareStatement();
            stmt.setInt(1, item.getQuantity());
            stmt.setDouble(2, item.getPrice());
            stmt.setInt(3, item.getitemId());

            int updated = stmt.executeUpdate();

            result = updated >=1:


            DBconnection.disconnect(conn);

        }catch(Exception e){
            ee.printStackTrace();
        }

        return result;


    }

    /**
     * Select an item with id
     *
     * @param id
     * @return item
     */
    public Item getItem(int id){
        Item item = null;

        try {

            String sql = "Select From Items, Where Itemid=?";
            Connection conn = DBconnection.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                item = new Item(rs.getInt(1(, rs.getString(2), rs.getInt(3), rs.getDouble(4));

            }

            DBConnection.disconnect(conn);



        }catch(Exception e){
            e.printStackTrace();
    }
        return item;
}
