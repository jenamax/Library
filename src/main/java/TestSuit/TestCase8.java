package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by simon on 2/7/2018.
 */
public class TestCase8 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.setName("LIBRARIAN");
        Patron f = new Patron();
        f.setType("faculty");
        f.setName("FACULTY");
        Patron s = new Patron();
        s.setType("student");
        s.setName("STUDENT");
        librarian.addPatron(s);
        librarian.addPatron(f);

        Book b = new Book();
        b.setDoc(5, "How to take A in ITP", 1488, "A.Naumchev", "");
        b.setCopies(1);

        s.checkout(b);
        System.out.println(s.documents.get(0).daysRemained+ " days");
    }
}
