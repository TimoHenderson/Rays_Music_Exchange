package Instruments;

import Enums.InstType;
import Enums.Material;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(InstType category, String model, Material material, double buyingPrice, double sellingPrice, int numStrings) {
        super(category, model, material, buyingPrice, sellingPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public String play() {
        return "Twang";
    }


}
