package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;


public interface FormDataService {
    public ResponseEntity<?> getAllFormData();
    //GET ALL
    public ResponseEntity<?> getSpecificUser(Long id);
    //GET SPECIFIC
    public ResponseEntity<?> setFormData(ArrayList<?> collection);
    //INSERT
    public ResponseEntity<?> DeleteFormData();
    //DELETE
}
