package com.example.demo.repository;
import com.example.demo.cstExceptions.CstAuthException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository{
    //DONT USE JPA - CUSTOM METHOD FOR DB OPERATIONS.
    ResponseEntity<?> createEmployee(String firstName, String lastName, String email, String password) throws CstAuthException;
    ResponseEntity<?> getUser() throws CstAuthException;
    ResponseEntity<?> getUserById(String firstName, String lastName, String email, String password) throws CstAuthException;
    ResponseEntity<?> updateEmployee(String firstName, String lastName, String email, String password) throws CstAuthException;
}
