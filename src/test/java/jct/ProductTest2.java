package jct;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class ProductTest2 {

    @Test
    public void testCase1SetPrice() {
        Integer price = -1;
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
        Integer price = 0;
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
        Integer price = 1;
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
        Integer price = 129;
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
        Integer price = 130;
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
        int price = 131;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }
}
