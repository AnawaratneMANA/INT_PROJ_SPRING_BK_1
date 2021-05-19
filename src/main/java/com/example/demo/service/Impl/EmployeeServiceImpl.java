package com.example.demo.service.Impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *  This Service Class Need to be Altered and remove JPA.
 */

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllUser() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Optional<Employee> getSpecificUser(Long id) {
        Optional<Employee> employees = employeeRepository.findById(id);
        return employees;
    }

    @Override
    public ResponseEntity<?> setUser(Employee employee) {
        try {
            employeeRepository.save(employee);
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> updateUser(Long id, Employee updatedUser) {
        Optional<Employee> yetToUpdate = employeeRepository.findById(id);
        if(yetToUpdate.isPresent()) {
            Employee yetToUpdateEmployee = yetToUpdate.get();
            yetToUpdateEmployee.setEmail(updatedUser.getEmail());
            yetToUpdateEmployee.setFirstName(updatedUser.getFirstName());
            yetToUpdateEmployee.setLastName(updatedUser.getLastName());
            yetToUpdateEmployee.setUserName(updatedUser.getUserName());

            //SAVE THE UPDATED USER.
            employeeRepository.save(yetToUpdateEmployee);
            return new ResponseEntity<Employee>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User Need to Update Not exist", HttpStatus.NOT_FOUND);
        }
    }
}
