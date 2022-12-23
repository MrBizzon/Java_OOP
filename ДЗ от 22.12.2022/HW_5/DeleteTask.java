package HW_5;

import java.util.Scanner;

public class DeleteTask {
    static Scanner sc = new Scanner(System.in);

    public static void deleteTask() {
        boolean repeatInput = true;
        int id = -1;
        while (repeatInput) {
            System.out.println("Введите ID задачи, которую нужно удалить: ");
            try {
                id = sc.nextInt();
                if (TaskList.getTaskById(id) != -1) {
                    repeatInput = false;
                    TaskList.removeById(id);
                } else {
                    System.out.println("Неверный ID");
                }
            } catch (Exception ex) {
                System.out.println("Неверный ID");
            }

        }
    }

}