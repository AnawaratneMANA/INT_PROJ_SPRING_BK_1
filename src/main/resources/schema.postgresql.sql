DROP TABLE IF EXISTS emp_table;

CREATE TABLE emp_table
(
    user_id    integer primary key not null,
    first_name varchar(50)         not null,
    last_name varchar(50) not null,
    user_name varchar(30) not null,
    email varchar(10) not null
);

create sequence emp_table_seq increment 1 start 1



