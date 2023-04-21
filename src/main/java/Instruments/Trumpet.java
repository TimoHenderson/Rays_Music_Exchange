package Instruments;

import Enums.InstType;
import Enums.Material;

public class Trumpet extends Instrument {
    public int length;

    public Trumpet(String model, Material material, double buyingPrice, double sellingPrice, int length) {
        super(InstType.BRASS, model, material, buyingPrice, sellingPrice);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String play() {
        return "Toot";
    }
}
