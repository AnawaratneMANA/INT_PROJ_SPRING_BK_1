package com.example.demo.repository;
import com.example.demo.cstExceptions.CstAuthException;
import com.example.demo.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository{
    //DONT USE JPA - CUSTOM METHOD FOR DB OPERATIONS.
    ResponseEntity<?> createEmployee(Employee employee) throws CstAuthException;
    List<Employee> getUser() throws CstAuthException;
    Optional<Employee> getUserById(Long id ) throws CstAuthException;
    Optional<Employee> updateEmployee(Long id, Employee employee) throws CstAuthException;
}
