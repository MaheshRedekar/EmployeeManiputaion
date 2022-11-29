package com.example.EmployeeManiputaion.controller;

import com.example.EmployeeManiputaion.entity.Employee;
import com.example.EmployeeManiputaion.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service serviceImpl;

    @RequestMapping("/home")
    public String home() {
        return "welcome..";
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return this.serviceImpl.getEmployees();
    }
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/employee/{employeeId}")
    public Employee getbyId(@PathVariable int employeeId){
        return this.serviceImpl.getEmpById(employeeId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.serviceImpl.addEmployee(employee);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/employee/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        return this.serviceImpl.updateEmployee(employeeId, employee);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/employee/{employeeId}")
    public Employee deleteEmployee(@PathVariable String employeeId) {
        return this.serviceImpl.deleteEmployee(Integer.parseInt(employeeId));
    }
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/emp/{designation}")
    public List<Employee> getByDesignation(@PathVariable String designation){
        return this.serviceImpl.getByDesignation(designation);
    }
}
