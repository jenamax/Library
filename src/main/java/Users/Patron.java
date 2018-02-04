package Users;

import Documents.Document;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Patron extends User {
    String type; //faculty or student
    ArrayList <Document> documents; //documents checked by this user
    public Patron(){
    //public Patron(String name, String phoneNumber, String email, int id, String type) {
      //  super(name, phoneNumber, email, id);
      //  documents = new ArrayList<>();
        //this.type = type;
    }

    void checkout(Document doc){
        //get list of documents
        documents.add(doc);
        doc.setAvailability(false);

        //rewrite list of documents
    }

    void toReturn(Document doc){
        //get list of documents
        documents.remove(doc);
        doc.setAvailability(true);
        //TODO check data and fee
        //rewrite list of documents
    }
}
