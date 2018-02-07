package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by simon on 2/7/2018.
 */
public class TestCase8 {
    Librarian librarian = new Librarian();
    Patron f = new Patron();
    f.setType("faculty");
    Patron s = new Patron();
    s.setType("student");
    Book b = new Book();
    b.setBestSeller(true);
    b.setCopies(1);
    s.checkout(b);
    System.out.println(s.documents.get(0).daysRemained);
}
