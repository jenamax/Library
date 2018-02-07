package TestSuit;

import Documents.Book;
import Documents.Document;
import Users.Librarian;
import Users.Patron;

/**
 * Created by evgeniy on 07.02.18.
 */
public class TestCase10 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Patron p = new Patron();
        p.setType("student");
        Book a = new Book();
        a.setDoc(1, "a", 10, "", "");
        a.setCopies(1);
        Book b = new Book();
        b.setCopies(1);
        b.setDoc(2, "b", 10, "", "reference");

        p.checkout(a);
        p.checkout(b);

        for (Document doc : p.documents){
            System.out.println(doc.getTitle());
        }
    }
}
