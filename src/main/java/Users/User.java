package Users;

import Documents.Document;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21.01.18.
 */
public class User {
    public String name;
    public int id;
    public String phoneNumber;
    public String email;
    public String address;
    public String phone_number;

    //public User(String name, String phoneNumber, String email, int id){
    public User(){

    }

//    ArrayList<Documents.Document> search(ArrayList<Documents.Document> docs, String searchStr){
//        //get list of documents
//        ArrayList<Documents.Document> result = new ArrayList<>();
//        boolean containAuthor;
//        for (Document doc : docs) {
//            containAuthor = false;
//            for (String author : doc.getAuthors()) {
//                if (searchStr.equals(author))
//                    containAuthor = true;
//            }
//            if (doc.getTitle().equals(searchStr) || containAuthor)
//                result.add(doc);
//        }
//        return result;
//    }
}
