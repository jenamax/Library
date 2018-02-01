package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

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

    public boolean isHere(String login) throws SQLException {
        Executor executor = new Executor(connection);
        String sql = "SELECT id, username, password, user_type from users where username='"+login+"'"; //SQL Query
       try {

           List<String> profile = executor.execQuery(sql, new ResultHandler<List>() {
               public List<String> handle(ResultSet result) throws SQLException {
                   List<String> resultSet = new LinkedList<>();
                   result.next();
                   resultSet.add(result.getString("id"));
                   resultSet.add(result.getString("username"));
                   resultSet.add(result.getString("password"));
                   resultSet.add(result.getString("user_type"));
                   return resultSet;
               }
           });

           //System.out.println("ID: "+id);
           for (int i = 0; i < 4; i++) {
               System.out.println(profile.get(i));
           }
           return true;
       }catch (SQLException e){
           return false;
       }

    }

    public boolean authControl(String login, String password){
        Executor executor = new Executor(connection);
        String sql = "SELECT id, username, password, user_type from users where username='"+login+"'"; //SQL Query
        try {

            List<String> profile = executor.execQuery(sql, new ResultHandler<List>() {
                public List<String> handle(ResultSet result) throws SQLException {
                    List<String> resultSet = new LinkedList<>();
                    result.next();
                    resultSet.add(result.getString("id"));
                    resultSet.add(result.getString("username"));
                    resultSet.add(result.getString("password"));
                    resultSet.add(result.getString("user_type"));
                    return resultSet;
                }
            });

            //System.out.println("ID: "+id);
            for (int i = 0; i < 4; i++) {
                System.out.println(profile.get(i));
            }

            if(profile.get(2).equals(password)) {
                return true;
            }else return false;
        }catch (SQLException e){
            return false;
        }
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
