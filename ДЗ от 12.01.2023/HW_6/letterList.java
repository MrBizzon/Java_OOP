package HW_6;

import java.util.ArrayList;
import java.util.List;

public class letterList {
    public static Integer count = 0;

    private static List<Userletter> messageList = new ArrayList<>();

    public static void addMessage(Userletter mes) {
        messageList.add(mes);
        count++;
        System.out.println("Количество сообщений = " + count + ";\n");
    }

    public static List<Userletter> getMessageList() {
        return messageList;
    }

    public static void editMessage(Integer index, Userletter element) {
        for (Userletter item : messageList) {
            if (item.getMessageID().equals(index)) {
                messageList.set(messageList.indexOf(item), element);
            }
        }
        messageList.set(index, element);
    }

    public static void printMessageList() {
        System.out.println("Идентификатор сообщения" + "  |  " + "Ник пользователя" + "  |  " + "Текст сообщения\n");
        for (Userletter item : messageList) {
            System.out.println("        " + item.getMessageID() + "   |        " + item.user.getName() + "      |   "
                    + item.getMessageText() + "\n");
        }
    }
}