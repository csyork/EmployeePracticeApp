package com.example.practiceApp.dao;

import com.example.practiceApp.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public List<Employee> removeEmployee(long employeeId, Employee newEmployee);

    public List<Employee> changeDepartment(long employeeId, String department);


}
