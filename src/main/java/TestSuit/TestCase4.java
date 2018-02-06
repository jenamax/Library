package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 06.02.18.
 */
public class TestCase4 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Patron f = new Patron();
        f.setName("f");
        f.setType("faculty");
        Patron s = new Patron();
        s.setName("s");
        s.setType("student");

        Book b = new Book();
        b.setDoc(1, "b", 0, "", "");
        b.setBestSeller(true);
        b.setCopies(1);
        f.checkout(b);

        System.out.println(b.getTitle() + " checked on " + f.documents.get(0).daysRemained + " days");
    }
}
