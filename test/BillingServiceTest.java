package com.hms.test;

import com.hms.model.Billing;
import com.hms.service.BillingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingServiceTest {

    @Test
    void testCreateAndMarkBillAsPaid() {
        BillingService service = new BillingService();
        Billing b = new Billing("B001", "P1", 800.0, "23-06-2025", false);
        service.createBill(b);

        assertFalse(service.getBillById("B001").isPaid());
        service.markBillAsPaid("B001");
        assertTrue(service.getBillById("B001").isPaid());
    }
}
