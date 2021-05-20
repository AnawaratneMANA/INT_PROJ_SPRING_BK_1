DROP DATABASE employees;
DROP USER postgresql;
CREATE USER postgresql with password 'postgresql';
CREATE DATABASE employees  WITH template=template0 owner=postgresql;
\CONNECT employees;
ALTER DEFAULT PRIVILEGES GRANT  ALL ON tables to postgresql;
ALTER DEFAULT PRIVILEGES GRANT ALL ON sequences  to postgresql;

create table employees.emp
(
    user_id    integer primary key not null,
    first_name varchar(50)         not null,
    last_name varchar(50) not null,
    email varchar(30) not null,
    password text not null
)



