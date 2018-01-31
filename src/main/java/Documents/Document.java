package Documents;

import java.util.ArrayList;
import java.util.Hashtable;

public class Document {
    private int id;
    private Boolean availability;
    private String title;
    private int price;
    private ArrayList<String> authors;
    private ArrayList<String> keys;

    public Document( String title, int price, ArrayList<String> authors, ArrayList<String> keys) {
        id = title.hashCode();
        this.title = title;
        this.price = price;
        this.authors = authors;
        this.keys = keys;
        availability = true;
    }

    public void setAvailability(boolean a){this.availability = a;}

    public Boolean available(){
        return availability;
    }
    public String getTitle(){return title;}
    public int getPrice(){return price;}
    public ArrayList<String> getAuthors(){return authors;}
    public ArrayList<String> getKeys(){return keys;}
}
