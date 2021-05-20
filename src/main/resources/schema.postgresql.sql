DROP TABLE IF EXISTS customer;

CREATE TABLE employee
(
    EMP_ID Bigserial PRIMARY KEY NOT NULL,
    F_NAME    varchar(100)          NOT NULL,
    L_NAME    varchar(100)          NOT NULL,
    U_NAME    varchar(100)          NOT NULL,
    E_NAME    varchar(100)          NOT NULL
);
