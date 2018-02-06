package Users;

import DB.DBtest;
import Documents.Book;
import Documents.Document;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Patron extends User {
    public String type; //faculty or student
    public ArrayList <Document> documents; //documents checked by this user
    DBtest data;
    public Patron(){
    //public Patron(String name, String phoneNumber, String email, int id, String type) {
      //  super(name, phoneNumber, email, id);
      //  documents = new ArrayList<>();
        //this.type = type;
        //data = new DBtest();
        documents = new ArrayList<>();
    }

    public void checkout(Document doc){
        //TODO: get list of documents from db
        if (doc.copiesNumber() > 0) {
            documents.add(doc);
            doc.setCopies(doc.copiesNumber() - 1);
            if (!doc.getClass().toString().equals("class Documents.Book")){
                doc.daysRemained = 14;
            }
            else if (this.type.equals("faculty")){
                doc.daysRemained = 28;
            } else{
                Book b = (Book) doc;
                if (b.isBestSeller()){
                    doc.daysRemained = 14;
                }
                else {
                    doc.daysRemained = 21;
                }
            }
        }

        else{
            System.out.println("No available documents");
        }

        //TODO: rewrite list of documents
    }

    public void toReturn(Document doc){
        //TODO get list of documents
        documents.remove(doc);
        doc.setCopies(doc.copiesNumber() + 1);
        //TODO check data and fee
        //TODO rewrite list of documents
    }
}
