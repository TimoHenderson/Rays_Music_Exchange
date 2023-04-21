package Accesories;

import Behaviours.ISell;
import Enums.AccessoryType;

public abstract class Accessory implements ISell {

    private AccessoryType accessoryType;
    private String brand;
    private double buyingPrice;
    private double sellingPrice;


    public Accessory(AccessoryType accessoryType, String brand, double buyingPrice, double sellingPrice) {

        this.accessoryType = accessoryType;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }
}
