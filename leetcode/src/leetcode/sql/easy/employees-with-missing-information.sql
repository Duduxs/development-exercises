Create table If Not Exists Employees (employee_id int, name varchar(30))
Create table If Not Exists Salaries (employee_id int, salary int)
Truncate table Employees
insert into Employees (employee_id, name) values ('2', 'Crew')
insert into Employees (employee_id, name) values ('4', 'Haven')
insert into Employees (employee_id, name) values ('5', 'Kristian')
Truncate table Salaries
insert into Salaries (employee_id, salary) values ('5', '76071')
insert into Salaries (employee_id, salary) values ('1', '22517')
insert into Salaries (employee_id, salary) values ('4', '63539')

-- First Solution

select * from (select e.employee_id from Employees e 
left outer join Salaries s using(employee_id)
where s.employee_id is null
union all 
select s.employee_id from Employees e 
right outer join Salaries s using(employee_id)
where e.employee_id is null) t order by 1 asc

-- Second Solution

select * from (select e.employee_id from Employees e 
left outer join Salaries s using(employee_id)
where s.employee_id is null
union all 
select s.employee_id from Employees e 
right outer join Salaries s using(employee_id)
where e.employee_id is null) t order by t.employee_id