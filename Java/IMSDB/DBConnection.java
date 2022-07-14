public class DBConnection {

    import java.sql.*;

    // DB parameters
    private static final String URL = "jdbc:mysql://rds-free.crktn2ycvrwh.eu-west-2.rds.amazonaws.com:3306" ;
    private static final String USER = "root" ;
    private static final String PASSWORD = "ochroot256" ;
    private static final String DBNAME = "IMSDB";
    private static final String PARAMETERS = "?verifyServerCertificate=false&useSSL=true";

    // Connection
    Public static Connection getConnection(){
       Connection conn - null;

       try{
           conn = DriverManage.getConnection(URL+DBNAME+PARAMETERS, USER, PASSWORD);

       }catch(Exception e){
           e.printStackTrace();
       }

       return conn;
    }
}

Public static void disconnect(Connection conn){
    try{
        if(conn != null){
            conn.close();
        }

        }catch(Exception e){
        e.printStackTrace();

        }
        }

        public static void main(String[] args){
    Connection conn = getConnection();

    if (conn !=null){
        System.out.println("Connection Successful.");

        }else{
        System.out.println("Connection Failed.");
        }

        }
