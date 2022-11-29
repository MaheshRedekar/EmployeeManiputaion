package com.example.EmployeeManiputaion.service;

import com.example.EmployeeManiputaion.entity.Employee;
import com.example.EmployeeManiputaion.exception.EnterValidDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@org.springframework.stereotype.Service
public class Service implements Iservice {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public String addEmployee(Employee employee) throws EnterValidDataException {
        Employee employee1 = new Employee();
        employee1.setId(employee.getId());
        //for email validation
        Pattern validation = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        //for designation validation
        String str = "analyst,manager,senior manager,portfolio manager,Consultant,senior Consultant,director,senior director,COO,CFO,CEO";
        String str1 = "India,France,Japan,USA,Germany,Italy,Russia";
        if (employee.getName().length() > 2) {
            employee1.setName(employee.getName());
        }
        else {
            return "enter valid name";
        }
        if (employee.getMailId().length() != 0 && validation.matcher(employee.getMailId()).matches()) {
            employee1.setMailId(employee.getMailId());
        }
        else {
            return "enter valid email";
        }
        if (employee.getDesignation().length() != 0 && ((str.contains(employee.getDesignation())))) {
            employee1.setDesignation(employee.getDesignation());
        }
        else {
            return "enter valid designation.";
        }
        if (employee.getCountry().length() != 0 && ((str1.contains(employee.getCountry())))) {
            employee1.setCountry(employee.getCountry());
        }
        else {
            return "enter valid Country.";
        }


        employee1.setCountry(employee.getCountry());
        employeeList.add(employee1);
        return "Employee Added Successfully";
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public String updateEmployee(int employeeId, Employee employee) {
        Employee emp = null;
        for (Employee employee1 : employeeList) {
            if (employee1.getId() == employeeId) {
                employee1.setName(employee.getName());
                employee1.setMailId(employee.getMailId());
                employee1.setDesignation(employee.getDesignation());
                employee1.setCountry(employee.getCountry());
                emp = employee1;
                break;
            }
        }
        return "Employee Updated successfully";
    }

    @Override
    public String deleteEmployee(int employeeId) {
        Employee emp = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeId) {
                emp = employee;
                employeeList.remove(employee);
                break;
            }
        }
        return "Employee deleted.";
    }

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
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getDesignation().equals(designation)) {
                list.add(employee);
                break;
            }
        }
        return list;
    }

    @Override
    public List<Employee> getByCountry(String country) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getCountry().equals(country)) {
                list.add(employee);
                break;
            }
        }
        return list;
    }

    public boolean validateDesignation() {
//        String values[] = {"Software engineer", "Analyst", "manager", "senior manager", "portfolio manager", "director", "consultant", "senior consultant"};
//        List<String> validation = new ArrayList<>();
//        validation.add("software engineer");
//        validation.add("analyst");
//        validation.add("manager");
//        validation.add("senior manager");
//        validation.add("portfolio manager");
//        //  if (Str)

        return true;
    }

}
