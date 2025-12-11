package com.fpt.employeeservice.controller;

import com.fpt.employeeservice.entity.Employee;
import com.fpt.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee e) {
        service.addEmployee(e);
    }
}