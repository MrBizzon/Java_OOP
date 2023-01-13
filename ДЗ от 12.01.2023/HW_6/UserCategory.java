package HW_6;

public class UserCategory extends User {
    protected TypeOfUsers userType;

    public UserCategory(String nickName, Integer age, String emailAddress, TypeOfUsers userType) {
        super(nickName, age, emailAddress);
        this.userType = userType;
    }

    public TypeOfUsers getUserType() {
        return userType;
    }

    public String getName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Ник пользователя: " + nickName+ ";\n" +
                "Возраст пользователя составляет: " + age+ ";\n" +
                "Электронная почта пользователя: " + emailAddress+ ";\n" +
                "Роль пользователя: " + userType + "\n";
    }
}