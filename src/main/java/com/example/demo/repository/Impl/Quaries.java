package com.example.demo.repository.Impl;

public class Quaries {
    public static final String CREATE_USER =
            "insert into employees.emp" +
                    "(user_id, " +
                    "first_name, " +
                    "last_name, " +
                    "user_name, " +
                    "email)" +
            " values(nextval(employees.emp_seq),?,?,?,?)";
}
