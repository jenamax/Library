package TestSuit;

import Documents.Book;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 06.02.18.
 */
public class TestCase6 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Patron p = new Patron();
        p.setType("");
        p.setName("p");
        Book b = new Book();
        librarian.add(b);
        b.setDoc(1, "b", 1, "", "");
        b.setCopies(2);
        p.checkout(b);
        p.checkout(b);
        System.out.println(librarian.documents.get(0).copiesNumber());
    }
}
