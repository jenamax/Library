package Documents;

import java.util.ArrayList;

public class Book extends Document{

    private String press;
    private int year;
    private boolean bestSeller;

    public Book(){//String title, int price, ArrayList<String> author, ArrayList<String> keys, String press, int year) {
        //super(title, price, author,keys);
    }

    public void setPress(String p){
        press = p;
    }

    public void setYear(int y){
        year = y;
    }

    public void setBestSeller(boolean b){
        bestSeller = b;
    }

    public String getPress(){return press;}
    public int getYear(){return year;}
    public boolean isBestSeller(){return bestSeller;}
}
