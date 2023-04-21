package Instruments;

import Enums.InstType;
import Enums.Material;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(String model, Material material, double buyingPrice, double sellingPrice, int numStrings) {
        super(InstType.STRING, model, material, buyingPrice, sellingPrice);
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
