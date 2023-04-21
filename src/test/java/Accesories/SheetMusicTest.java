package Accesories;

import Enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic music;

    @Before
    public void setUp() {
        music = new SheetMusic("Hal Leonard", 2, 4, "Hanon");
    }


    @Test
    public void getAccessoryType() {
        assertEquals(AccessoryType.SHEET_MUSIC, music.getAccessoryType());
    }

    @Test
    public void getBrand() {
        assertEquals("Hal Leonard", music.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2, music.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4, music.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2, music.calculateMarkup(), 0.01);
    }

    @Test
    public void getTitle() {
        assertEquals("Hanon", music.getTitle());
    }

}