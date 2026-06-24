package com.example.employee_management_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_api.model.Employee;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", "IT", 50000));
        employees.add(new Employee(2, "Alice", "HR", 45000));
        employees.add(new Employee(3, "Bob", "Finance", 55000));

        return employees;
    }
}