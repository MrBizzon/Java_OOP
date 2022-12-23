package HW_5;

import java.io.File;
import java.util.Scanner;

public class WriteService {
    public static String path = "c:/Users/Bz/Desktop/Java_OOP/ДЗ от 22.12.2022/HW_5/TaskList";
    static Scanner sc = new Scanner(System.in);

    public static void getChoice() {

        while (true) {
            System.out.println("Записать в: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    writeAsXML();
                    break;
                }
                case ("2") -> {
                    writeAsCSV();
                    break;
                }
                case ("3") -> {
                    writeAsJSON();
                    break;
                }
                default -> System.out.println("Ошибка записи");
            }
        }
    }

    public static void writeAsXML() {
        path += ".xml";
        WriteAsXML exp = new WriteAsXML(new File(path));
    }

    public static void writeAsCSV() {
        path += ".csv";
        WriteAsCSV exp = new WriteAsCSV(new File(path));
    }

    public static void writeAsJSON() {
        path += ".json";
        WriteAsJSON exp = new WriteAsJSON(new File(path));
    }

}