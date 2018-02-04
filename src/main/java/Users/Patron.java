package Users;

import Documents.Document;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Patron extends User {
    String type;
    ArrayList <Document> documents;
    public Patron(String name, String phoneNumber, String email, int id, String type) {
        super(name, phoneNumber, email, id);
        documents = new ArrayList<>();
        this.type = type;
    }

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
