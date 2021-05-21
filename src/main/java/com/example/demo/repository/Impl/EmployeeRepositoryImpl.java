package com.example.demo.repository.Impl;

import com.example.demo.cstExceptions.CstAuthException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.example.demo.repository.Impl.Quaries.*;

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
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(SELECT_ALL_USERS);
        List<Employee> result = new ArrayList<Employee>();
        for(Map<String, Object> row: rows){
            Employee emp =  new Employee();
            emp.setUserName((String) row.get("user_name"));
            emp.setFirstName((String) row.get("first_name"));
            emp.setLastName((String) row.get("last_name"));
            emp.setEmail((String) row.get("email"));
            result.add(emp);
        }
        return result;
    }

    @Override
    public Optional<Employee> getUserById(Long id) throws CstAuthException {
//        return (Employee) jdbcTemplate.queryForObject(SELECT_SPECIFIC_USERS, new Object[]{id}, new RowMapper<Employee>(){
//            @Override
//            public Employee mapRow()
//        })
        return Optional.empty();
    }

    @Override
    public Optional<Employee> updateEmployee(Long id, Employee employee) throws CstAuthException {
        return Optional.empty();
    }
}
