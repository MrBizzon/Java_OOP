package HW_5;

import java.io.File;
import java.util.Scanner;

public class ReaderService {
    static Scanner sc = new Scanner(System.in);
    public static String path = "c:/Users/Bz/Desktop/Java_OOP/ДЗ от 22.12.2022/HW_5/TaskList";

    public static void getChoice() {
        boolean repeatInput = true;
        while (repeatInput) {
            System.out.println("Из какого файла прочитать: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    ReaderFromXML();
                    repeatInput = false;
                }
                case ("2") -> {
                    ReaderFromCSV();
                    repeatInput = false;
                }
                case ("3") -> {
                    ReaderFromJSON();
                    repeatInput = false;
                }
                default -> System.out.println("Ошибка чтения");
            }
        }
    }

    public static void ReaderFromXML() {
        path += ".xml";
        ReaderFromXML imp = new ReaderFromXML(new File(path));
    }

    public static void ReaderFromCSV() {
        path += ".csv";
        ReaderFromCSV imp = new ReaderFromCSV(new File(path));
    }

    public static void ReaderFromJSON() {
        path += ".json";
        ReaderFromJSON imp = new ReaderFromJSON(new File(path));
    }

}