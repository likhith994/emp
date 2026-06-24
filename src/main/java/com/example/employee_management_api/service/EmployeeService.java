package com.example.employee_management_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_api.model.Employee;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", "IT", 155000));
        employees.add(new Employee(2, "Alice", "HR", 145000));
        employees.add(new Employee(3, "Bob", "Finance", 155000));

        return employees;
    }
}