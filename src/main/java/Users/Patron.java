package Users;

import DB.DBtest;
import Documents.Document;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Patron extends User {
    private String type;
    private ArrayList <Document> documents;

    public Patron(String name, String phoneNumber, String email, int id, String type) {
        super(name, phoneNumber, email, id);
        documents = new ArrayList<>();
        this.type = type;
    }

    public String getType(){return type;}
    public ArrayList<Document> docs(){return documents;}

    void checkout(Document doc){
        documents.add(doc);
        doc.setAvailability(false);
    }

    void toReturn(Document doc){
        documents.remove(doc);
        doc.setAvailability(true);
        //TODO check data and fee
    }
}
