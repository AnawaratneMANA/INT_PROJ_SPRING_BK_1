package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    //GET ALL METHOD
    public List<Employee> getAllUser();
    //GET SPECIFIC
    public Optional<Employee> getSpecificUser(Long id);
    //INSERT
    public ResponseEntity<?> setUser(Employee employee);
    //UPDATE
    public ResponseEntity<?> updateUser(Long id, Employee updatedUser);
    //DELETE

}
