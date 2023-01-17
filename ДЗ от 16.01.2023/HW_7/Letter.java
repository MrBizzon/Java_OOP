package HW_7;

import java.util.Date;

public abstract class Letter {
    public Date date;
    public UserCategory user;
    public String text;

    public Letter(Date date, UserCategory user, String text){
        this.date = date;
        this.user = user;
        this.text = text;
    }
    
}