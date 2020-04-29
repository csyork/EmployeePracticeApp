package com.example.practiceApp.api;

import com.example.practiceApp.dao.EmployeeDAO;
import com.example.practiceApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmoyees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public List<Employee> removeEmployee(long employeeId, Employee employee) {
        return employeeDAO.removeEmployee(employeeId,employee);
    }

    @Override
    public List<Employee> changeDepartment(long employeeId, String department) {
        return employeeDAO.changeDepartment(employeeId,department);
    }

}
