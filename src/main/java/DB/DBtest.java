package DB;


import Users.Librarian;
import Users.Patron;
import Users.User;

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

    public User authControl(String login, String password){
        String log = "[AuthControl]: ";
        Executor executor = new Executor(connection);
        String sql = "SELECT id, username, password, surname, name, user_type, address, phone_number" +
                ", user_type from users where username='"+login+"'"; //SQL Query


        try {

            List<String> profile = executor.execQuery(sql, new ResultHandler<List>() {
                public List<String> handle(ResultSet result) throws SQLException {
                    List<String> resultSet = new LinkedList<>();
                    result.next();
                    resultSet.add(result.getString("id"));         //0
                    resultSet.add(result.getString("username"));   //1
                    resultSet.add(result.getString("password"));   //2
                    resultSet.add(result.getString("surname"));    //3
                    resultSet.add(result.getString("name"));       //4
                    resultSet.add(result.getString("user_type"));  //5
                    resultSet.add(result.getString("address"));    //6
                    resultSet.add(result.getString("phone_number")); //7
                    return resultSet;
                }
            });


            for (int i = 0; i < 8; i++) {
                System.out.println(log+profile.get(i));
            }

            User user;

            if(profile.get(5).equals("Librarian")){
                user = new Librarian();
                System.out.println(log+"ITS LIBRARIAN");
            }else user = new Patron();

            user.id=Integer.parseInt(profile.get(0));
            user.name=profile.get(4)+" "+profile.get(3);
            user.address = profile.get(6);
            user.phone_number = profile.get(7);



            if(profile.get(2).equals(password)) {
                System.out.println(log+"Passwords coincided");
                return user;
            }else return null;
        }catch (SQLException e){
            return null;
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
