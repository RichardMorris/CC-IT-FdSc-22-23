package ac.uk.cornwallcollege.richardmorris.shopping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingRecorderTest {

    @Test
    public void test_testing() {
        assertTrue(true);
    }

    @Test
    public void test_addWantedItems() {
        ShoppingRecorder sr = new ShoppingRecorder();
        sr.addWantedItem("apple",6);
    }

    @Test
    public void test_consume_when_no_corresponding_item() {
        ShoppingRecorder sr = new ShoppingRecorder();
        try {
            sr.consume("apple", 6);
            fail("Should have raised an exception");
            // normal case
        } catch(IllegalStateException ex) {
            // does this when an error
            System.out.println("Expected exception caught "+ex);
        }
    }

    @Test
    public void test_buy_item_and_stockOf() {
        ShoppingRecorder sr = new ShoppingRecorder();
        assertEquals(0, sr.stockOf("apples"));
        sr.buyItem("apples", 6);
        assertEquals(6, sr.stockOf("apples"));
        sr.consume("apples",2);
        assertEquals(4, sr.stockOf("apples"));
    }

    @Test
    public void test_check_inventory() {
        ShoppingRecorder sr = new ShoppingRecorder();
        {
            sr.addWantedItem("onions", 5);
            String[] array = sr.inventory();
            assertEquals(1, array.length);
            assertEquals("onions", array[0]);
        }

        {
            sr.addWantedItem("onions", 5);
            String[] array = sr.inventory();
            assertEquals(1, array.length);
        }

        {
            sr.addWantedItem("carrots", 3);
            String[] array = sr.inventory();
            assertEquals(2, array.length);
            assertEquals("carrots", array[0]);
            assertEquals("onions", array[1]);
        }

    }

}
