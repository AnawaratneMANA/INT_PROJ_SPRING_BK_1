package com.example.demo.repository.Impl;

public class Quaries {
    public static final String CREATE_USER =
            "insert into emp_table" +
                    "(user_id, " +
                    "first_name, " +
                    "last_name, " +
                    "user_name, " +
                    " email)" +
            " values(nextval('emp_table_seq'),?,?,?,?)";
}
