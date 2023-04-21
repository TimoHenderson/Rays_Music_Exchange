package Accesories;

import Enums.AccessoryType;

public class SheetMusic extends Accessory {

    private String title;


    public SheetMusic(String brand, double buyingPrice, double sellingPrice, String title) {
        super(AccessoryType.SHEET_MUSIC, brand, buyingPrice, sellingPrice);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
