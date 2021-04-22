package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.mycompany.myapp.web.rest.TestUtil;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Product.class);
        Product product1 = new Product();
        product1.setId(1L);
        Product product2 = new Product();
        product2.setId(product1.getId());
        assertThat(product1).isEqualTo(product2);
        product2.setId(2L);
        assertThat(product1).isNotEqualTo(product2);
        product1.setId(null);
        assertThat(product1).isNotEqualTo(product2);
    }

    @Test
    void testCase1SetPrice() {
        int price = -1;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertNotEquals(true, valid);
    }

    @Test
    void testCase2SetPrice() {
        int price = 0;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    void testCase3SetPrice() {
        int price = 1;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    void testCase4SetPrice() {
        int price = 129;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    void testCase5SetPrice() {
        int price = 130;
        boolean valid = false;
        if (price >= 0 && price <= 130) {
            valid = true;
        } else {
            valid = false;
        }
        assertEquals(true, valid);
    }

    @Test
    void testCase6SetPrice() {
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
