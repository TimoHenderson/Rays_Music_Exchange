package Accesories;

import Enums.AccessoryType;

public class Sticks extends Accessory {
    private String weight;

    public Sticks(String brand, double buyingPrice, double sellingPrice, String weight) {
        super(AccessoryType.STICKS, brand, buyingPrice, sellingPrice);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }
}
