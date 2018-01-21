package main;

/**
 * Created by evgeniy on 21.01.18.
 */
public class User {
    String name;
    int id;
    String phoneNumber;
    String email;

    public User(String name, String phoneNumber, String email, int id){
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    void search(){  //TODO: add parameters of searching and make method return list of documents
        //TODO: search by title, by author, by title and author
    }
}
