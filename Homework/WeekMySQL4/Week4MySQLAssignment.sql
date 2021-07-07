#1 Using an IN parameter, this will return the date range salary of an employee's earned salaries.
DELIMITER //
use employees //
CREATE PROCEDURE emp_salary(IN p_emp_no INTEGER)
BEGIN
SELECT e.first_name, e.last_name, s.salary, s.from_date, s.to_date
FROM employees e JOIN salaries s ON e.emp_no = s.emp_no
WHERE e.emp_no = p_emp_no;
END //
DELIMITER ;
CALL emp_salary(10031);

#2 Using an IN parameter, this will return the average salary of an employee.
DELIMITER //
use employees //
CREATE PROCEDURE emp_avg_salary(IN p_emp_no INTEGER)
BEGIN
SELECT e.first_name, e.last_name, AVG(s.salary)
FROM employees e JOIN salaries s ON e.emp_no = s.emp_no
WHERE e.emp_no = p_emp_no;
END //
DELIMITER ;
CALL emp_avg_salary(10031);

#3 This will return the titles of a given employee first name and last name.
DELIMITER \\
CREATE PROCEDURE emp_titles(IN first_name VARCHAR(255), IN last_name VARCHAR(255))
BEGIN
SELECT t.title
FROM titles t 
WHERE first_name = first_name AND last_name = last_name;
END \\
DELIMITER ;
CALL emp_titles('Karsten', 'Joslin');

#4 This proceedure will return employee names and titles who are Assistant Engineer.  Different titles can be called.
DELIMITER \\
CREATE PROCEDURE names_titles(IN lv_title VARCHAR(255))
BEGIN
SELECT e.first_name, e.last_name, t.title
FROM titles t
INNER JOIN employees e ON t.emp_no = e.emp_no
WHERE t.title = lv_title;
END \\
DELIMITER ;
CALL names_titles('Assistant Engineer');

#5 Parameter will require the user to type in first and last name of an employee and return that employee's employee number.
DELIMITER \\
CREATE PROCEDURE emp_info(in p_first_name varchar(255), in p_last_name varchar(255), out p_emp_no integer)
BEGIN
SELECT e.emp_no INTO p_emp_no 
FROM employees e
WHERE e.first_name = p_first_name AND e.last_name = p_last_name;
END\\
DELIMITER ;
#Below should return the emp_no '10031'.
set @p_emp_no = 0;
call employees.emp_info('Karsten', 'Joslin', @p_emp_no); 
select @p_emp_no;