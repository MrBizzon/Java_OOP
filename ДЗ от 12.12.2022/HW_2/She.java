package HW_2;

import java.util.ArrayList;
import java.util.Random;
import HW_2.WardrobeSpace.CabinetDoor;

public class She extends He {

    Random random = new Random();

    public She() { }
   
    public boolean permission() {
        if (random.nextInt(2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void addItems(ArrayList<String> clothes, WardrobeSpace highLow) {
        highLow.openOrClosed = CabinetDoor.Open;
        highLow.clothes.addAll(clothes);
        highLow.openOrClosed = CabinetDoor.Close;
    }

    public void addItems(String clothes, WardrobeSpace highLow) {
        highLow.openOrClosed = CabinetDoor.Open;
        highLow.clothes.add(clothes);
        highLow.openOrClosed = CabinetDoor.Close;
    }
    
    public void findIt(String item, WardrobeSpace highLow) {
        highLow.openOrClosed = CabinetDoor.Open;
        if (highLow.clothes.contains(item)) System.out.println("Имеется");
        else System.out.println("Требуется?");
        highLow.openOrClosed = CabinetDoor.Close;
    }
    
}