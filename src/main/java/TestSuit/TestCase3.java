package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 05.02.18.
 */
public class TestCase3 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Patron f = new Patron();
        f.type = "faculty";
        f.name = "f";
        Patron s = new Patron();
        s.type = "student";
        librarian.patrons.add(f);
        librarian.patrons.add(s);

        Book b = new Book();
        System.out.println(b.getClass());
        b.setDoc(1, "b", 100, "a", "");
        b.setCopies(1);
        f.checkout(b);

        System.out.println("Book " + librarian.patrons.get(0).documents.get(0).getTitle() + " checked by " + librarian.patrons.get(0).name + " on " + librarian.patrons.get(0).documents.get(0).daysRemained + " days");
    }
}
