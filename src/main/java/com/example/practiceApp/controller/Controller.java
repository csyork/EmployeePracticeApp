package com.example.practiceApp.controller;

import com.example.practiceApp.api.EmployeeService;
import com.example.practiceApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    public EmployeeService employeeService;

    @Autowired
    public Controller (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     *
     * @param employee
     * @return list of employees after a new employee is added.
     */
    @PostMapping("/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    /**
     *
     * @return list of all employees.
     */

    @GetMapping("/getAllEmployees")
    public List<Employee> getallEmployees() {
        return employeeService.getAllEmoyees();
    }

    /**
     *
     * @param employeeId
     * @param newEmployee
     * @return list of the new employees after one is removed and added with new employee.
     */
    @PostMapping("/removeEmployee/{id}")
    public List<Employee> removeEmployee(@PathVariable("id") long employeeId, @RequestBody Employee newEmployee) {
        return employeeService.removeEmployee(employeeId,newEmployee);
    }

    /**
     *
     * @param employeeId
     * @param department
     * @return list of employees with updated department.
     */
    @PutMapping("/api/edit/{id}")
    public List<Employee> editEmployeeDepartment(@PathVariable("id") long employeeId, @RequestBody String department) {
        return employeeService.changeDepartment(employeeId,department);
    }



}
