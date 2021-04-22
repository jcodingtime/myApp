package jct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {

    @Test
    public void testCase1SetPrice() {
        BigDecimal price = -1;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }

    @Test
    public void testCase2SetPrice() {
        BigDecimal price = 0;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase3SetPrice() {
        BigDecimal price = 1;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase4SetPrice() {
        BigDecimal price = 129;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase5SetPrice() {
        BigDecimal price = 130;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    public void testCase6SetPrice() {
        BigDecimal price = 131;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }
}
