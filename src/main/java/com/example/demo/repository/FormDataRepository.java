package com.example.demo.repository;

import com.example.demo.cstExceptions.CstAuthException;
import com.example.demo.model.Employee;
import com.example.demo.model.RequestForm;
import org.springframework.http.ResponseEntity;

public interface FormDataRepository {
    //DONT USE JPA - CUSTOM METHOD FOR DB OPERATIONS.
    ResponseEntity<?> createFormData(RequestForm requestForm) throws CstAuthException;
}
