package Instruments;

import Enums.InstType;
import Enums.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Yamaha 4000", Material.BRASS, 200, 400., 6);
    }

    @Test
    public void hasInstType() {
        assertEquals(InstType.BRASS, trumpet.getInstType());
    }

    @Test
    public void hasModel() {
        assertEquals("Yamaha 4000", trumpet.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.BRASS, trumpet.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(400, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasLength() {
        assertEquals(6, trumpet.getLength());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(200, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Toot", trumpet.play());
    }
}