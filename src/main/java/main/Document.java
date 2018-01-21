package main;

import java.util.Hashtable;

public class Document {
    int id;
    Boolean availability;
    public Document( String title, int price, String [] author, String [] keys) {
        id = title.hashCode();
    }
    public Boolean available(){
        return true;
    }
    




}
