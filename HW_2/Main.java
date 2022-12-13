package HW_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        WardrobeSpace shelf = new WardrobeSpace();
        She she = new She();
        He he = new He();

        ArrayList<String> purse = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            purse.add("Сумка " + random.nextInt(7));
        }

        for (int i = 0; i < 13; i++) {
            she.addItems("Вещь " + random.nextInt(8), shelf);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Он забирает");
        System.out.println(shelf.clothes.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Она возвращает забранное в платяной шкаф и добавляет свой выбор");
        she.addItems(purse, shelf);
        System.out.println(shelf.clothes.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("А теперь другой вариант");

        ArrayList<String> hat = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hat.add("Шляпа " + random.nextInt(1, 6));
        }
        she.observe(she, shelf);
        she.takeItems(hat, shelf, she);
        System.out.println(shelf.clothes.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("А теперь добавляем тещу");

        He motherInLaw = new She();
        motherInLaw.takeItems(hat, shelf, she);
        he.observe(she, shelf);
    }
}