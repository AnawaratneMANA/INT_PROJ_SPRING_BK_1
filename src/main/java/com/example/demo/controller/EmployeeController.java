package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        try{
            employeeRepository.save(employee);
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    //UPDATE EMPLOYEE
    //DELETE EMPLOYEE


}
