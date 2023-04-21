package Instruments;

import Enums.InstType;
import Enums.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone sax;

    @Before
    public void setUp() throws Exception {
        sax = new Saxophone("Hohner 10", Material.BRASS, 2000, 4000, 2);
    }

    @Test
    public void getInstType() {
        assertEquals(InstType.WOODWIND, sax.getInstType());
    }

    @Test
    public void getModel() {
        assertEquals("Hohner 10", sax.getModel());
    }

    @Test
    public void getMaterial() {
        assertEquals(Material.BRASS, sax.getMaterial());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2000, sax.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4000, sax.getSellingPrice(), 0.01);
    }

    @Test
    public void getBellSize() {
        assertEquals(2, sax.getBellSize());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2000, sax.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Parp", sax.play());
    }
}