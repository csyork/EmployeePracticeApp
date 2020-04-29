package com.example.practiceApp.dao;

import com.example.practiceApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> employees = new ArrayList<Employee>();
    private AtomicLong nextId = new AtomicLong();

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setId(nextId.incrementAndGet());
        employees.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Employee> removeEmployee(long employeeId, Employee newEmployee){
        for (Employee employee: employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                newEmployee.setId(employeeId);
                employees.add(newEmployee);
                return employees;
            }
        }
        return null;
    }

    public List<Employee> changeDepartment(long employeeId, String department) {
        for (Employee employee: employees) {
            if (employee.getId() == employeeId) {
                employee.setDepartment(department);
                return employees;
            }
        }
        return null;
    }
}
