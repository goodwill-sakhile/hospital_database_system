package com.hms.test;

import com.hms.util.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testRoundToTwoDecimals() {
        assertEquals(5.67, MathUtil.roundToTwoDecimals(5.6666));
    }

    @Test
    void testIsPositive() {
        assertTrue(MathUtil.isPositive(4));
        assertFalse(MathUtil.isPositive(-3));
    }
}
