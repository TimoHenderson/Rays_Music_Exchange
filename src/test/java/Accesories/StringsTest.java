package Accesories;

import Enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void setUp() {
        strings = new Strings("Ernie Ball", 2, 4, 6, 0.09);
    }


    @Test
    public void getAccessoryType() {
        assertEquals(AccessoryType.STRINGS, strings.getAccessoryType());
    }

    @Test
    public void getBrand() {
        assertEquals("Ernie Ball", strings.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2, strings.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4, strings.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2, strings.calculateMarkup(), 0.01);
    }

    @Test
    public void getNumStrings() {
        assertEquals(6, strings.getNumStrings());
    }

    @Test
    public void getGauge() {
        assertEquals(0.09, strings.getGauge(), 0.01);
    }
}