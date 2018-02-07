package TestSuit;

import Documents.Document;
import Users.Librarian;
import Users.Patron;

/**
 * Created by simon on 2/6/2018.
 */
public class TestCase7 {
    public static void main(String[] args){
        Librarian librarian = new Librarian();
        librarian.setName("librarian");


        Patron p1 = new Patron();
        p1.setName("p1");

        Patron p2 = new Patron();
        p2.setName("p2");

        librarian.addPatron(p1);
        librarian.addPatron(p2);

        Document b1 = new Document();
        b1.setDoc(2, "How to take A grade in ITP?",1488,"V. Riviera","no-reference");
        b1.setCopies(2);

        p1.checkout(b1);
        p2.checkout(b1);

        for(int i=0; i<librarian.patrons.size(); i++){
            System.out.println(librarian.patrons.get(i).documents);
        }


    }
}
