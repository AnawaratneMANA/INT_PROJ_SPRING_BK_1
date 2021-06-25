package com.example.demo.service.Impl;

import com.example.demo.model.Employee;
import com.example.demo.model.RequestForm;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.FormDataRepository;
import com.example.demo.service.FormDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public class FormDataServiceImpl implements FormDataService {

    private FormDataRepository formDataRepository;

    @Override
    public ResponseEntity<?> getAllFormData() {
        return null;
    }

    @Override
    public ResponseEntity<?> getSpecificUser(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> setFormData(RequestForm collection) {
        try {
            formDataRepository.createFormData(collection);
            return new ResponseEntity<RequestForm>(collection, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> DeleteFormData() {
        return null;
    }
}
