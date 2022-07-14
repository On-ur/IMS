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
}
