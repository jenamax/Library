package Documents;

import java.util.ArrayList;

public class Books extends Document{
    public Books(String title, int price, ArrayList<String> author, ArrayList<String> keys) {
        super(title, price, author,keys);
    }
}
