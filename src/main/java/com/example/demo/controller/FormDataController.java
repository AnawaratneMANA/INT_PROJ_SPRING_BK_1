package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.RequestForm;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FormDataController {

    @Autowired
    FormDataService formDataService;

    //SAVE EMPLOYEE
    @PostMapping("/employee")
    public ResponseEntity<?> setFormData(@RequestBody RequestForm formData){
        return formDataService.setFormData(formData);
    }

}
