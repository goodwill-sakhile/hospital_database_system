package com.hms.test;

import com.hms.util.TextUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextUtilTest {

    @Test
    void testCapitalize() {
        assertEquals("Hello", TextUtil.capitalize("hello"));
    }

    @Test
    void testRepeat() {
        assertEquals("xxx", TextUtil.repeat("x", 3));
    }
}
