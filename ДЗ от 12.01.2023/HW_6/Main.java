package HW_6;

public class Main {

       public static void main(String[] args) {

            ListOfUsers.addUser(new UserCategory("Oleg",54,"bizzon@mail.ru", TypeOfUsers.Модератор));

            ListOfUsers.printUsersList();
            View.run();
    }

}