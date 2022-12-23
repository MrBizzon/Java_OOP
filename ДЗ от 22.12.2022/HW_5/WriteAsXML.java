package HW_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAsXML {
    public WriteAsXML(File file) {

        try (FileWriter fr = new FileWriter(file, false);) {
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<TaskList>\n");
            for (Purpose task : PurposeList.getPurpose()) {
                strBuilder.append("<задача>\n<Дата создания>");
                strBuilder.append(task.getCreateDate());
                strBuilder.append("</Дата создания>\n");
                strBuilder.append("<Время создания>");
                strBuilder.append(task.getCreateTime());
                strBuilder.append("</Время создания>\n");
                strBuilder.append("<Дедлайн>");
                strBuilder.append(task.getDeadline());
                strBuilder.append("</Дедлайн>\n");
                strBuilder.append("<Автор>");
                strBuilder.append(task.getAuthor());
                strBuilder.append("</author>\n");
                strBuilder.append("<Описание>");
                strBuilder.append(task.getDescription());
                strBuilder.append("</Описание>\n");
                strBuilder.append("<Приоритет>");
                strBuilder.append(task.getPurposePriority());
                strBuilder.append("</Приоритет>\n</задача>\n");
            }
            strBuilder.append("</TaskList>");
            fr.append(strBuilder.toString());
        } catch (IOException e) {
            System.out.printf("Ошибка записи! %s", e);
        }
    }

}