package com.hms.repository;

import com.hms.model.Department;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for managing hospital departments.
 */
public class DepartmentRepository {
    private final List<Department> departments = new ArrayList<>();

    public void save(Department department) {
        departments.add(department);
    }

    public Department findByName(String name) {
        for (Department d : departments) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public List<Department> findAll() {
        return new ArrayList<>(departments);
    }
}
