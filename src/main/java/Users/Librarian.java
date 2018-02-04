package Users;

import Booking.BookingSystem;
import Documents.Document;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Librarian extends User {

    ArrayList<Patron> patrons;

    void addPatron(String name, String phoneNumber, String email, String type){
        Patron newPatron = new Patron();
        newPatron.name = name;
        newPatron.phone_number = phoneNumber;
        newPatron.email = email;
        newPatron.id = (name + phoneNumber).hashCode();
        newPatron.type = type;
        patrons.add(newPatron);
    }

    void removePatron(String name, String phoneNumber){
        int id = (name + phoneNumber).hashCode();
        for (Patron patron : patrons){
            if (patron.id == id)
                patrons.remove(patron);
        }
    }

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
        //get list of documents
        documents.remove(doc);
        //rewrite list of documents
    }
}
