package Instruments;

import Enums.InstType;
import Enums.Material;

public class Snare extends Instrument {


    private int numLugs;

    public Snare(String model, Material material, double buyingPrice, double sellingPrice, int numLugs) {
        super(InstType.PERCUSSION, model, material, buyingPrice, sellingPrice);
        this.numLugs = numLugs;
    }

    public int getNumLugs() {
        return numLugs;
    }

    @Override
    public String play() {
        return "BANG";
    }
}
