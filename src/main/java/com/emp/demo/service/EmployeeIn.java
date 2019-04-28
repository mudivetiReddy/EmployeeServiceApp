package com.emp.demo.service;

import com.emp.demo.model.Employee;

import java.util.List;

public interface EmployeeIn {

    public Employee saveEmployee();
    public List<Employee> getEmployees();

    Employee saveEmployee(Employee emp);
}
