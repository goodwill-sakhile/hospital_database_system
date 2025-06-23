package com.hms.test;

import com.hms.util.IDGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDGeneratorTest {

    @Test
    void testGenerateID() {
        String id = IDGenerator.generateID("pat");
        assertTrue(id.startsWith("PAT-"));
        assertEquals(12, id.length());
    }
}
