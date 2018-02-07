package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by simon on 2/7/2018.
 */

public class TestCase2 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.setName("LIBRARIAN");
        Patron f = new Patron();
        f.setName("TupaPatron");
        librarian.addPatron(f);

        Book b = new Book();
        b.setDoc(5, "How to take A in ITP", 1488, "A", "");
        b.setCopies(0);

        f.checkout(b);
    }
}
