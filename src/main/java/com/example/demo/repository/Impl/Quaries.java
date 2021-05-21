package com.example.demo.repository.Impl;

public class Quaries {
    public static final String CREATE_USER =
            "INSERT INTO emp_table" +
                    "(user_id, " +
                    "first_name, " +
                    "last_name, " +
                    "user_name, " +
                    " email)" +
            " VALUES(nextval('emp_table_seq'),?,?,?,?)";

    public static final String SELECT_ALL_USERS =
            "SELECT * FROM emp_table";
}
