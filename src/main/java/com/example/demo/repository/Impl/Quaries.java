package com.example.demo.repository.Impl;

public class Quaries {
    //INSERT INTO QUERY
    public static final String CREATE_USER =
            "INSERT INTO emp_table" +
                    "(user_id, " +
                    "first_name, " +
                    "last_name, " +
                    "user_name, " +
                    " email)" +
            " VALUES(nextval('emp_table_seq'),?,?,?,?)";

    //SELECT ALL QUERY
    public static final String SELECT_ALL_USERS =
            "SELECT * FROM emp_table";

    //SELECT SPECIFIC QUERY
    public static final String SELECT_SPECIFIC_USERS =
            "SELECT * FROM emp_table WHERE user_id = ?";
}
