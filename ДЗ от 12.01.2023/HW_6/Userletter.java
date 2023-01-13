package HW_6;

import java.util.Date;

public class Userletter extends letter {

    private Integer messageID;

    public Userletter(Integer messageID, Date date, UserCategory user, String text) {
        super(date, user, text);
        this.messageID = messageID;
    }

    public Integer getMessageID() {
        return messageID;
    }

    public UserCategory getUser(){
        return user;
    }
    public String getMessageText() {

        return text;
    }
    @Override
    public String toString() {
        return "Идентификатор сообщения: " + messageID + ";\n" +
                user +
                "Текст сообщения пользователя:" + text + "\n";
    }
}