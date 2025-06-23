package com.hms.admin;

import java.util.ArrayList;
import java.util.List;

public class BulkUserImporter {
    public List<String> generateDummyUsers(int count) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            users.add("user" + i + ",user" + i + "@hms.com,password" + i);
        }
        return users;
    }
}
