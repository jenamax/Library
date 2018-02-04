package Documents;

import java.util.ArrayList;

public class Books extends Document{

    private String press;
    private int year;

    public Books(String title, int price, ArrayList<String> author, ArrayList<String> keys, String press, int year) {
        super(title, price, author,keys);
        this.press = press;
        this.year = year;
    }

    public String getPress(){return press;}
    public int getYear(){return year;}
}
