package jct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void testCase1SetTotalPrice() {
        Double totalPrice = -1.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }

    @Test
    public void testCase2SetTotalPrice() {
        Double totalPrice = 0.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase3SetTotalPrice() {
        Double totalPrice = 1.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase4SetTotalPrice() {
        Double totalPrice = 9998.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase5SetTotalPrice() {
        Double totalPrice = 9999.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase6SetTotalPrice() {
        Double totalPrice = 10000.0;
        boolean valid = false;
        if (totalPrice >= 0 && totalPrice <= 9999) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }
}
