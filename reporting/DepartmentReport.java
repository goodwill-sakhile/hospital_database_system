package com.hms.reporting;

import com.hms.model.Department;
import com.hms.repository.DepartmentRepository;

import java.util.List;

/**
 * Report on departments and their info.
 */
public class DepartmentReport implements ReportGenerator {
    private final DepartmentRepository repo;

    public DepartmentReport(DepartmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Department> depts = repo.findAll();
        System.out.println("=== Department Report ===");
        for (Department d : depts) {
            System.out.println(d.getId() + " - " + d.getName() + " @ " + d.getLocation());
        }
    }
}
