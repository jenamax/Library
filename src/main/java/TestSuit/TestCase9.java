package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 06.02.18.
 */
public class TestCase9 {
    public static void main(String[] args) {
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
}
