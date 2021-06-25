package com.example.demo.repository.Impl;

public class Quaries {
    //INSERT INTO QUERY - CREATE USER
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

    //UPDATE EMPLOYEES QUERY.
    public static final String UPDATE_USERS = "UPDATE emp_table set first_name = ?, last_name = ?, user_name  = ?, email = ? where user_id = ?";


    /**
     * Form Data Submission related queries.
     */

    //INSERT QUERY.
    public static final String CREATE_FORM_DATA = "INSERT INTO form_data_table " +
            "(id, " +
            "userId, " +
            "projectId, " +
            "projectName) " +
            " VALUES(nextval('form_data_table_seq'),?,?,?)";
}
