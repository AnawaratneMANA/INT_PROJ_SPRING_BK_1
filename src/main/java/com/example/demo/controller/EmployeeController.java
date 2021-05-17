package com.example.demo.controller;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //GET EMPLOYEES
    //GET EMPLOYEE BY ID
    //SAVE EMPLOYEE
    //UPDATE EMPLOYEE
    //DELETE EMPLOYEE


}
