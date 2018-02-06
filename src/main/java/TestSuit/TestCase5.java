package TestSuit;

import Documents.Document;
import Users.Librarian;
import Users.Patron;

public class TestCase5 {

    public static void main(String[] args) {

        Librarian librarian = new Librarian();
        Patron patron1 = new Patron();
        patron1.name = "patron1";
        Patron patron2 = new Patron();
        patron2.name = "patron2";
        Patron patron3 = new Patron();
        patron3.name = "patron3";
        librarian.addPatron(patron1);
        librarian.addPatron(patron2);
        librarian.addPatron(patron3);

        Document a = new Document();
        a.setDoc(1, "A", 10, "Author", "");
        a.setCopies(2);


        patron1.checkout(a);
        patron2.checkout(a);
        patron3.checkout(a);

    }
}
