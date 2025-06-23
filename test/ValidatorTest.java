package com.hms.test;

import com.hms.util.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void testEmailValidation() {
        assertTrue(Validator.isEmailValid("user@mail.com"));
        assertFalse(Validator.isEmailValid("invalid-mail"));
    }

    @Test
    void testPhoneValidation() {
        assertTrue(Validator.isPhoneValid("0821234567"));
        assertFalse(Validator.isPhoneValid("abc123"));
    }
}
