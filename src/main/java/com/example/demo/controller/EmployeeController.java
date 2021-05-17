package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //GET EMPLOYEES
    @GetMapping("/employees")
    public ResponseEntity<?> getUser(){
        List<Employee> employees = employeeRepository.findAll();
        if(employees.size() > 0){
            return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No User Available", HttpStatus.NOT_FOUND);
        }
    }
    //GET EMPLOYEE BY ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id){
        Optional<Employee> employees = employeeRepository.findById(id);
        if(employees.isPresent()){
            return new ResponseEntity<>(employees.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No User Available", HttpStatus.NOT_FOUND);
        }
    }

    //SAVE EMPLOYEE
    //UPDATE EMPLOYEE
    //DELETE EMPLOYEE


}
