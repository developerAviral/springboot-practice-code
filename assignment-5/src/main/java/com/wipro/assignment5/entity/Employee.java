package com.wipro.assignment5.entity;


import java.util.Objects;


public class Employee {


    public int employeeId;


    public String employeeName;


    public String employeeEmail;


    public String location;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                Objects.equals(employeeName, employee.employeeName) &&
                Objects.equals(employeeEmail, employee.employeeEmail) &&
                Objects.equals(location, employee.location);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employeeId, employeeName, employeeEmail, location);
    }
}
