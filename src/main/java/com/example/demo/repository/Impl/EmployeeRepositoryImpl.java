package com.example.demo.repository.Impl;

import com.example.demo.cstExceptions.CstAuthException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import static com.example.demo.repository.Impl.Quaries.CREATE_USER;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public ResponseEntity<?> createEmployee(Employee employee) throws CstAuthException {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(CREATE_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getUserName());
            ps.setString(4, employee.getEmail());
            return ps;
        }, keyHolder);
        return null;
    }

    @Override
    public List<Employee> getUser() throws CstAuthException {
        return null;
    }

    @Override
    public Optional<Employee> getUserById(Long id) throws CstAuthException {
        return Optional.empty();
    }

    @Override
    public Optional<Employee> updateEmployee(Long id, Employee employee) throws CstAuthException {
        return Optional.empty();
    }
}
