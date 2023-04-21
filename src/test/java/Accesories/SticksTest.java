package Accesories;

import Enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SticksTest {

    Sticks sticks;

    @Before
    public void setUp() {
        sticks = new Sticks("Mapex", 2, 4, "7A");
    }


    @Test
    public void getAccessoryType() {
        assertEquals(AccessoryType.STICKS, sticks.getAccessoryType());
    }

    @Test
    public void getBrand() {
        assertEquals("Mapex", sticks.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2, sticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4, sticks.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2, sticks.calculateMarkup(), 0.01);
    }

    @Test
    public void getWeight() {
        assertEquals("7A", sticks.getWeight());
    }


}