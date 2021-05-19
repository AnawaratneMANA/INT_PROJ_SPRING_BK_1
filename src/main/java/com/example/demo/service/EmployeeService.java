package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    //GET ALL METHOD
    public List<Employee> getAllUSer();
    //GET SPECIFIC
    public Optional<Employee> getSpecificUser(Long id);
    //INSERT
    public Employee setUser(Employee employee);
    //UPDATE
    public Employee updateUser(Long id, Employee updatedUser);
    //DELETE

}
