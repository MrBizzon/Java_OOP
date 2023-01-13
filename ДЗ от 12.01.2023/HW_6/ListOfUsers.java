package HW_6;

import java.util.ArrayList;
import java.util.List;

public class ListOfUsers {
    private static List<UserCategory> userList= new ArrayList<>();

    public static void addUser(UserCategory user){
        userList.add(user);
        System.out.println("Пользователь "+ user.getNickName() +" успешно добавлен;\n");
    }
    public static void removeUser(String nickName) {
        System.out.println("Пользователь " + nickName + " удален.");
        try {

            for (UserCategory item : userList) {
                if (item.getNickName().equals(nickName)) {
                    userList.remove(item);
                }
            }
        } catch (Exception e) {
            System.out.println("ОШИБКА при удалении");
        }

    }

    public static UserCategory getUser(String name) {
        UserCategory temp = new UserCategory("Безымянный",00,"нет почты", TypeOfUsers.ADMIN);
        for (UserCategory item : userList) {
            if (item.getNickName().equals(name)) {
                temp = item;
            }
        }

        return temp;

    }
    public static void printUsersList() {
        for (UserCategory item : userList) {
            System.out.println(item.getName());
        }
    }
}