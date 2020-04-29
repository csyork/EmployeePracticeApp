package com.example.practiceApp.api;

import com.example.practiceApp.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmoyees();

    public List<Employee> removeEmployee(long employeeId, Employee employee);

    public List<Employee> changeDepartment(long employeeId, String department);
}
