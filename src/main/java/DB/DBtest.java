package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by simon on 1/29/2018.
 */
public class DBtest {
    private final Connection connection;

    public DBtest(){
        this.connection = getConnection();
    }

    private Connection getConnection(){
        try{
            String DB_URL = "jdbc:mysql://localhost:3306/innolibrary";
            String USER = "root";
            String PASS = "root";

            return DriverManager.getConnection(DB_URL, USER, PASS);
        }catch (SQLException sqlerr){
            sqlerr.printStackTrace();
        }
        return null;
    }

    public boolean isHere(String login){
        return false;
    }


    public void printInfo(){
        try {
            System.out.println("Name: "+ connection.getMetaData().getDatabaseProductName());
            System.out.println("XZ: " + connection.getMetaData().getCatalogTerm());
            System.out.println();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
