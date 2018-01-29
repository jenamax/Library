package servlets;

/**
 * Created by simon on 1/23/2018.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class AuthControl {
    static String DB_URL = "jdbc:mysql://localhost:3306/innolibrary";
    static String USER = "root";
    static String PASS="root";


    public static void main(String[] args) throws SQLException {

        Connection conn = null;  //Connection
        Statement stmt = null;  //Statement of SQL -> Query

        try{

            //STEP 2: Register JDBC driver
            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(driver);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");    
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;   //SQL requestion
            sql = "SELECT id, username, password, user_type  FROM users";
            ResultSet rs = stmt.executeQuery(sql);


            //STEP 5: Extract data from result set
            while(rs.next()){

                //Retrieve by column name
                String username  = rs.getString("username");
                String password = rs.getString("password");
                String id = rs.getString("id");
                String user_type = rs.getString("user_type");

                //Display values
                System.out.print("ID = "+ id + " Type = "+ user_type+ " Login: " + username + ", Pass: " + password + "\n");

            }

            //Write Test



            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            System.out.println(" 🚧 JDBC ERROR");
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            System.out.println("Class.forName ERROR");
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

    }


}
