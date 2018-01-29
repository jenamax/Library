package Users;

import Documents.Document;

import java.util.ArrayList;

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

    ArrayList<Documents.Document> search(ArrayList<Documents.Document> docs, String searchStr){
        ArrayList<Documents.Document> result = new ArrayList<>();
        boolean containAuthor;
        for (Document doc : docs) {
            containAuthor = false;
            for (String author : doc.getAuthors()){
                if (searchStr.equals(author))
                    containAuthor = true;
            }
            if (doc.getTitle().equals(searchStr) || containAuthor)
                result.add(doc);
        }
        return result;
    }
}
