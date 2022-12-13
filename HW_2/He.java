package HW_2;

import java.util.ArrayList;

import HW_2.WardrobeSpace.CabinetDoor;

public class He {

    public He() { }

    /*Перед тем, как заглянуть в шкаф (покопаться в нем) или взять из него что-то, необходимо получить разрешение жены - обеспечить открытие шкафа. Даже жене как классу, производному от мужа, нужно переспросить себя, перед тем как выполнить действия в Husband */
    
    private void confirm(She action, WardrobeSpace highLow) {
        if (action.permission() == false) {
            return;
        } else {
            highLow.setOpenOrClosed();
        }
    }

    public void observe(She action, WardrobeSpace highLow) {
        confirm(action, highLow);
        if (highLow.getOpenOrClosed() == CabinetDoor.Open)
            System.out.println(highLow.clothes.toString());
        else
            System.out.println("В другой раз");
        highLow.openOrClosed = CabinetDoor.Close;
    }

    public void takeItems(ArrayList<String> garment, WardrobeSpace highLow, She action) {
        confirm(action, highLow);
        if (highLow.getOpenOrClosed() == CabinetDoor.Open) {
            highLow.clothes.removeAll(garment);
            highLow.openOrClosed = CabinetDoor.Close;
        }
    }

    public void takeItems(String garment, WardrobeSpace highLow, She action) {
        confirm(action, highLow);
        if (highLow.getOpenOrClosed() == CabinetDoor.Open) {
            highLow.clothes.remove(highLow.clothes.indexOf(garment));
            highLow.openOrClosed = CabinetDoor.Close;
        }
    }

}