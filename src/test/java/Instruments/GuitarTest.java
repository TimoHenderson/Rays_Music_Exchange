package Instruments;

import Enums.InstType;
import Enums.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Stratocaster", Material.WOOD, 200, 400., 6);
    }

    @Test
    public void hasInstType() {
        assertEquals(InstType.STRING, guitar.getInstType());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, guitar.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(400, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(200, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Twang", guitar.play());
    }
}