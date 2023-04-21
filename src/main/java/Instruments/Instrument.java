package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Enums.InstType;
import Enums.Material;

public abstract class Instrument implements IPlay, ISell {
    private InstType category;
    private String model;
    private Material material;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstType category, String model, Material material, double buyingPrice, double sellingPrice) {
        this.category = category;
        this.model = model;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstType getInstType() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public Material getMaterial() {
        return material;
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
