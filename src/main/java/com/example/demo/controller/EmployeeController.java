package com.example.demo.controller;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private AuthenticationManager authenticationManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    //GET EMPLOYEES
    @GetMapping("/employees")
    public ResponseEntity<?> getUser(){
        return employeeService.getAllUser();
    }
    //GET EMPLOYEE BY ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id){
        return employeeService.getSpecificUser(id);
    }

    //SAVE EMPLOYEE
    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        return employeeService.setUser(employee);
    }
    //UPDATE EMPLOYEE
    @PutMapping("employee/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable(value = "id") Long employeeId, @RequestBody Employee updatedEmployee){
            return employeeService.updateUser(employeeId, updatedEmployee);
    }

    //DELETE EMPLOYEE

    //AUTHENTICATION - RETURN JWT
//    @PostMapping("/employee/authentication")
//    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//        try {
//            authenticationManager.authenticate({
//
//            })
//        } catch (Exception e){
//
//        }
//    }
}
