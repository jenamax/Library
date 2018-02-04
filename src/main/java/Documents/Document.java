package Documents;

import java.util.ArrayList;
import java.util.Hashtable;

public class Document {
    private int id;
    private Boolean availability;
    private String title;
    private int price;
    private ArrayList<String> authors;
    private ArrayList<String> keys;  //Не знаю зачем тебе тут лист стрингов, но из бд я достаю только стринги, если хочешь можешь
                            //написать метод разворачивания в листы))

    public Document() {
        //id = title.hashCode();
        this.title = title;
        this.price = price;
        this.authors = authors;
        this.keys = keys;
        availability = true;
        authors = new ArrayList<>();
        keys = new ArrayList<>();
    }

    public void setDoc(int id, String title, int price, String authors, String keys){
        this.id=id;
        this.title= title;
        this.price=price;

        this.authors.add(authors);
        this.keys.add(keys);
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
