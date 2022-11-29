package com.example.EmployeeManiputaion.service;

import com.example.EmployeeManiputaion.entity.Employee;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements Iservice {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee employee) {
        Employee emp = null;
        for (Employee employee1 : employeeList) {
            if (employee1.getId() == employeeId) {
                employee1.setName(employee.getName());
                employee1.setMailId(employee.getMailId());
                employee1.setDesignation(employee.getDesignation());
                employee1.setBirthDate(employee.getBirthDate());
                emp = employee1;
                break;
            }
        }
        return emp;
    }

    @Override
    public Employee deleteEmployee(int employeeId) {
        Employee emp = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeId) {
                emp = employee;
                employeeList.remove(employee);
                break;
            }
        }
        return emp;
    }

//    @Override
//    public List<Employee> getByDesignation(String designation, Employee employee) {
//        Employee emp=new Employee();
//        List<Employee> list=new ArrayList<>();
//        for(Employee employee1: employeeList){
//            if(employee1.getDesignation().equals(designation)){
//                emp=employee1;
//                list.add(emp);
//                break;
//            }
//        }
//        return list;
//    }

    @Override
    public Employee getEmpById(int employeeId) {
        Employee emp = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeId) {
                emp = employee;
                break;
            }
        }
        return emp;
    }

    @Override
    public List<Employee> getByDesignation(String designation) {
        List<Employee> list=new ArrayList<>();
        for(Employee employee:employeeList){
            if (employee.getDesignation().equals(designation)){
                list.add(employee);
                break;
            }
        }
        return list;
    }


}
