package TestSuit;

import Documents.Document;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 05.02.18.
 */
public class TestCase1 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Patron patron = new Patron();
        patron.name = "patron1";
        librarian.addPatron(patron);
        Document b = new Document();
        b.setDoc(1, "t1", 10, "a1", "");
        b.setCopies(2);

        patron.checkout(b);
        patron.documents.get(0).setCopies(1);

        System.out.println(patron.name + " " + "has " + librarian.patrons.get(0).documents.get(0).copiesNumber() + " copies of " + librarian.patrons.get(0).documents.get(0).getTitle());
    }
}
