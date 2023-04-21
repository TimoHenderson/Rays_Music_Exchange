package Instruments;

import Enums.InstType;
import Enums.Material;

public class Saxophone extends Instrument {
    private int bellSize;

    public Saxophone(String model, Material material, double buyingPrice, double sellingPrice, int bellSize) {
        super(InstType.WOODWIND, model, material, buyingPrice, sellingPrice);
        this.bellSize = bellSize;
    }

    public int getBellSize() {
        return bellSize;
    }

    @Override
    public String play() {
        return "Parp";
    }

}
