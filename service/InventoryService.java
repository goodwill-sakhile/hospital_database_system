package com.hms.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages inventory like medications and supplies.
 */
public class InventoryService {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addItem(String itemName, int quantity) {
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
        System.out.println("Added " + quantity + " of " + itemName);
    }

    public void removeItem(String itemName, int quantity) {
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) - quantity);
        System.out.println("Removed " + quantity + " of " + itemName);
    }

    public int checkStock(String itemName) {
        return inventory.getOrDefault(itemName, 0);
    }

    public Map<String, Integer> getInventoryReport() {
        return inventory;
    }
}
