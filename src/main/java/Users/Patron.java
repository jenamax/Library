package Users;

/**
 * Created by evgeniy on 21.01.18.
 */
public class Patron extends User {
    String type;
    public Patron(String name, String phoneNumber, String email, int id, String type) {
        super(name, phoneNumber, email, id);
        this.type = type;
    }

    void checkout(){   //TODO: add document as parametr

    }

    void toReturn(){   //TODO: add document as parametr

    }
}
