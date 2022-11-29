package com.example.EmployeeManiputaion.service;

import com.example.EmployeeManiputaion.entity.Employee;

import java.util.List;

public interface Iservice {
    List<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    Employee deleteEmployee(int employeeId);
   // List<Employee> getByDesignation(String designation, Employee employee);

    Employee getEmpById(int employeeId);

    List<Employee> getByDesignation(String designation);
}
