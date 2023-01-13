package HW_6;

import java.sql.Date;
import java.util.Scanner;

public class View {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой ник:");
        String nick = sc.nextLine();

        while (true) {

            System.out.println(
                    "Выбор задачи:\n1 - Добавить пользователя\n2 - Удалить пользователя\n3 - Написать сообщение\n4 - Редактировать сообщение\n5 - Поиск сообщения\n6 - Печать сообщений");
            String choice = sc.nextLine();
            System.out.println(ListOfUsers.getUser(nick).userType + "--------------------\n");
            switch (choice) {
                case ("1") -> {

                    if (ListOfUsers.getUser(nick).userType.equals(TypeOfUsers.ADMIN)) {

                        System.out.println("Введите ник для нового пользователя:");
                        String name = sc.nextLine();
                        System.out.println("Входной возраст:");
                        Integer age = Integer.parseInt(sc.nextLine());
                        System.out.println("Введите адрес электронной почты:");
                        String email = sc.nextLine();
                        System.out.println(
                                "Введите тип пользователя\n1 - USER\n2 - ADMIN\n3 - MODERATOR\n4 - GUEST");
                        String userType = sc.nextLine();

                        switch (userType) {
                            case ("1") -> {
                                ListOfUsers.addUser(new UserCategory(name, age, email, TypeOfUsers.USER));
                                break;
                            }
                            case ("2") -> {
                                ListOfUsers.addUser(new UserCategory(name, age, email, TypeOfUsers.ADMIN));
                                break;
                            }
                            case ("3") -> {
                                ListOfUsers.addUser(new UserCategory(name, age, email, TypeOfUsers.MODERATOR));
                                break;
                            }
                            case ("4") -> {
                                ListOfUsers.addUser(new UserCategory(name, age, email, TypeOfUsers.GUEST));
                                break;
                            }
                            default -> System.out.println("ОШИБКА ВВОДА!");

                        }

                    } else {
                        System.out.println("ОШИБКА доступа!");
                    }
                }
                case ("2") -> {

                    if (ListOfUsers.getUser(nick).getUserType().equals(TypeOfUsers.ADMIN)) {
                        System.out.println("Введите ник для удаления: ");
                        String nickName = sc.nextLine();
                        ListOfUsers.removeUser(nickName);
                    } else {
                        System.out.println("ОШИБКА доступа!");
                    }

                }

                case ("3") -> {
                    String inputMessage = sc.nextLine();
                    Date date = new Date(System.currentTimeMillis());
                    letterList.addMessage(new Userletter(letterList.count, date,
                            ListOfUsers.getUser(nick), inputMessage));
                }
                case ("4") -> {
                    System.out.println("Введите номер сообщения для редактирования: ");
                    Integer messageID = sc.nextInt();
                    System.out.println("Введите новый текст: ");
                    String messageText = sc.nextLine();
                    Date date = new Date(System.currentTimeMillis());
                    letterList.editMessage(messageID, new Userletter(letterList.count, date,
                            ListOfUsers.getUser(nick), messageText));
                }
                case ("5") -> {
                    String search = sc.nextLine();
                    for (Userletter item : letterList.getMessageList()) {
                        if (item.text.contains(search)) {
                            System.out.println(item.date + " " + item.user + " " + item.text);
                        }
                    }
                }
                case ("6") -> {
                    letterList.printMessageList();
                    break;
                }
                case ("7") -> {
                    System.out.println("До свидания!");
                    break;
                }
            }
        }
    }
}