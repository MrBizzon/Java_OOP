package HW_5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AddTask {
    static Scanner sc = new Scanner(System.in);

    public static void addTask() {
        boolean duplicateInput = true;
        String author;
        String description = new String();
        String priority = new String();
        LocalDate deadline = LocalDate.now();
        while (duplicateInput) {
            System.out.println("Когда дедлайн (YYYY-MM-DD): ");
            try {
                deadline = LocalDate.parse(sc.nextLine());
                duplicateInput = false;
            } catch (Exception ex) {
                System.out.println("Дата введена неправильно");
            }
        }
        System.out.println("Кто будет автором: ");
        author = sc.nextLine();
        System.out.println("Описание задачи");
        description = sc.nextLine();
        System.out.println("Приоритет задачи (низкий, средний, высокий): ");
        priority = sc.nextLine();
        TaskPriority purposePriority = TaskPriority.valueOf(priority);
        String time = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
        TaskList.add(new Task(LocalDate.now(), LocalTime.parse(time), deadline, author, description, purposePriority));
        Task.print(new Task(LocalDate.now(), LocalTime.parse(time), deadline, author, description, purposePriority));
    }

}