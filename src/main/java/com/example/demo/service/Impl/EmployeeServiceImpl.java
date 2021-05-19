package com.example.demo.service.Impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllUSer() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Optional<Employee> getSpecificUser(Long id) {
        return Optional.empty();
    }

    @Override
    public Employee setUser(Employee employee) {
        return null;
    }

    @Override
    public Employee updateUser(Long id, Employee updatedUser) {
        return null;
    }
}
