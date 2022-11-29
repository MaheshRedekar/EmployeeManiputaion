package com.example.EmployeeManiputaion.service;

import com.example.EmployeeManiputaion.entity.Employee;
import com.example.EmployeeManiputaion.exception.EnterValidDataException;

import java.util.List;

public interface Iservice {
   // String addEmployee(Employee employee, String mailId) throws EnterValidDataException;

    List<Employee> getEmployees();

    String addEmployee(Employee employee) throws EnterValidDataException;

    String updateEmployee(int employeeId, Employee employee);

    String deleteEmployee(int employeeId);

    Employee getEmpById(int employeeId);

    List<Employee> getByDesignation(String designation);

    List<Employee> getByCountry(String country);
}
