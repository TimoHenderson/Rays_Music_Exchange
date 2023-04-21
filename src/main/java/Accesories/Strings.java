package Accesories;

import Enums.AccessoryType;

public class Strings extends Accessory {
    private int numStrings;
    private double gauge;

    public Strings(String brand, double buyingPrice, double sellingPrice, int numStrings, double gauge) {
        super(AccessoryType.STRINGS, brand, buyingPrice, sellingPrice);
        this.numStrings = numStrings;
        this.gauge = gauge;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public double getGauge() {
        return gauge;
    }
}
