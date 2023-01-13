package HW_6;

import java.util.Date;

public abstract class letter {
    Date date;
    UserCategory user;
    String text;

    public letter(Date date, UserCategory user, String text) {
        this.date = date;
        this.user = user;
        this.text = text;
    }
}