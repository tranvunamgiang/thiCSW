package com.fpt.employeeservice.service;

import com.fpt.employeeservice.entity.Employee;
import com.fpt.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // 1. getEmployees
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    // 2. addEmployees (Fix lỗi: tên hàm phải khớp với Controller gọi)
    public void addEmployee(Employee e) {
        repository.save(e);
    }

    // 3. update Employee
    public void updateEmployee(Employee e) {
        repository.save(e);
    }

    // Helper: Lấy nhân viên theo ID
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
}