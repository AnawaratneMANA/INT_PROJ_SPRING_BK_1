package com.example.demo.repository.Impl;

import com.example.demo.cstExceptions.CstAuthException;
import com.example.demo.model.Employee;
import com.example.demo.model.RequestForm;
import com.example.demo.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

import static com.example.demo.repository.Impl.Quaries.CREATE_FORM_DATA;

public class FormDataRepositoryImpl implements FormDataRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public ResponseEntity<?> createFormData(RequestForm requestForm) throws CstAuthException {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(CREATE_FORM_DATA, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, requestForm.getUserId());
            ps.setString(2, requestForm.getProjectId());
            ps.setString(3, requestForm.getProjectName());
            return ps;
        }, keyHolder);
        return null;
    }
}
