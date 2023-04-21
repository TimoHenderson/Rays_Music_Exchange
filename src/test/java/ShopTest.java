import Accesories.SheetMusic;
import Accesories.Strings;
import Enums.Material;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;

    @Before
    public void setUp() {
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasStockArrayList() {
        assertEquals(0, shop.numItemsInStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(new Strings("Ernie Ball", 3, 5, 6, 0.09));
        assertEquals(1, shop.numItemsInStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        Strings strings = new Strings("Ernie Ball", 3, 5, 6, 0.09);
        shop.addItem(strings);
        assertEquals(1, shop.numItemsInStock());
        shop.removeItem(strings);
        assertEquals(0, shop.numItemsInStock());
    }

    @Test
    public void canCalculatePotentialProfit() {
        Guitar guitar = new Guitar("Strat", Material.WOOD, 200, 400, 6);
        SheetMusic music = new SheetMusic("H", 5, 10, "GHG");
        shop.addItem(guitar);
        shop.addItem(music);
        assertEquals(205, shop.calculatePotentialProfit(), 0.01);
    }
}
