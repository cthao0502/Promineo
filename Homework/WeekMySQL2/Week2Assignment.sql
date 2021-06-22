//Question 1:

select titles.*, count(*)
from employees
inner join titles on employees.emp_no = titles.emp_no
where birth_date > '1965-01-01'
group by titles.title
order by count(*) desc;

//Question 2:

select title as "Titles", avg(salary) as "Average Salary"
from salaries
inner join titles on salaries.emp_no = titles.emp_no
group by (title);

//Question 3:

select departments.dept_name, sum(salary)
from dept_emp
inner join departments on departments.dept_no = dept_emp.dept_no
inner join salaries on salaries.emp_no = dept_emp.emp_no
where departments.dept_name = 'Marketing'
and salaries.from_date >= '1990-01-01' and salaries.to_date <= '1992-12-31'
group by departments.dept_name;