Create table If Not Exists Employee (employee_id int, department_id int, primary_flag ENUM('Y','N'))
Truncate table Employee
insert into Employee (employee_id, department_id, primary_flag) values ('1', '1', 'N')
insert into Employee (employee_id, department_id, primary_flag) values ('2', '1', 'Y')
insert into Employee (employee_id, department_id, primary_flag) values ('2', '2', 'N')
insert into Employee (employee_id, department_id, primary_flag) values ('3', '3', 'N')
insert into Employee (employee_id, department_id, primary_flag) values ('4', '2', 'N')
insert into Employee (employee_id, department_id, primary_flag) values ('4', '3', 'Y')
insert into Employee (employee_id, department_id, primary_flag) values ('4', '4', 'N')

-- First Solution

select e1.employee_id, e1.department_id from Employee e1
where e1.primary_flag = 'Y' or (select count(department_id) = 1 from Employee where employee_id = e1.employee_id)
group by e1.employee_id

-- Second solution

select e1.employee_id, e1.department_id from Employee e1
where e1.primary_flag = 'Y' or (select count(department_id) = 1 from Employee where employee_id = e1.employee_id)