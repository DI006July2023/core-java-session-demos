CREATE DATABASE emp_dept_database;

USE emp_dept_database;

CREATE TABLE department_details (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(255)
);

CREATE TABLE employee_details (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(30),
    emp_dept_id INT
);

INSERT INTO department_details VALUES(101, 'HR'),(102, 'IT');
SELECT * FROM department_details;
INSERT INTO employee_details VALUES(501, 'ABC', 102);
INSERT INTO employee_details VALUES(502, 'LMN', 101);
INSERT INTO employee_details VALUES(503, 'ASD', 102);
SELECT * FROM employee_details;
INSERT INTO employee_details VALUES(504, 'GHJ', 234);

DROP TABLE employee_details;

CREATE TABLE employee_details (
    emp_id INT,
    emp_name VARCHAR(30),
    emp_dept_id INT,
    PRIMARY KEY(emp_id),
    FOREIGN KEY(emp_dept_id) REFERENCES department_details(dept_id)
);

DESC employee_details;
SELECT * FROM department_details;
INSERT INTO employee_details VALUES(501, 'ABC', 102);
INSERT INTO employee_details VALUES(502, 'LMN', 101);
INSERT INTO employee_details VALUES(503, 'ASD', 102);
INSERT INTO employee_details VALUES(504, 'GHJ', 234);
