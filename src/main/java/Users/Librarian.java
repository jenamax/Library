package Users;

import Booking.BookingSystem;
import Documents.Document;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Librarian extends User {
    //public Librarian(String name, String phoneNumber, String email, int id) {
    public Librarian() {
        //super(name, phoneNumber, email, id);
    }
    void add(){
        //TODO: Input title, authors, price

        // TODO: choosing type

        //TODO: for books: choose press, publisher and year; for articles: choose date, editor and journal


        //TODO: add creation of document
    }

    void modify(){

    }

    void remove(Document doc, ArrayList<Document> documents){
        documents.remove(doc);
    }
}
