package com.example.EmployeeManiputaion.entity;

public class Employee {
    private int id;
    private String name;
    private String mailId;
    private String designation;
    private int birthDate;

    public Employee() {
    }

    public Employee(int id, String name, String mailId, String designation, int birthDate) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.designation = designation;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", designation='" + designation + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
