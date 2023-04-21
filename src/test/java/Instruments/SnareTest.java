package Instruments;

import Enums.InstType;
import Enums.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnareTest {
    Snare snare;

    @Before
    public void setUp() {
        snare = new Snare("Mapex 5000", Material.STEEL, 200, 400., 6);
    }

    @Test
    public void hasInstType() {
        assertEquals(InstType.PERCUSSION, snare.getInstType());
    }

    @Test
    public void hasModel() {
        assertEquals("Mapex 5000", snare.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.STEEL, snare.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200, snare.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(400, snare.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumLugs() {
        assertEquals(6, snare.getNumLugs());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(200, snare.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("BANG", snare.play());
    }
}