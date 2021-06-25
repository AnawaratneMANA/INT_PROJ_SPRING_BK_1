DROP TABLE IF EXISTS emp_table;

CREATE TABLE emp_table
(
    user_id    integer primary key not null,
    first_name varchar(50)         not null,
    last_name varchar(50) not null,
    user_name varchar(30) not null,
    email varchar(10) not null
);

create sequence emp_table_seq increment 1 start 1;

-- To Create table and the sequence of the form_data_table
CREATE TABLE form_data_table
(
    id    integer primary key not null,
    userId varchar(50)         not null,
    projectId varchar(50) not null,
    projectName varchar(30) not null
);

create sequence form_data_table_seq increment 1 start 1;



