Create table If Not Exists Employees(employee_id int, name varchar(20), reports_to int, age int)
Truncate table Employees
insert into Employees (employee_id, name, reports_to, age) values ('9', 'Hercy', 'None', '43')
insert into Employees (employee_id, name, reports_to, age) values ('6', 'Alice', '9', '41')
insert into Employees (employee_id, name, reports_to, age) values ('4', 'Bob', '9', '36')
insert into Employees (employee_id, name, reports_to, age) values ('2', 'Winston', 'None', '37')

-- First Solution

select e1.employee_id, e1.name, count(*) as reports_count, round(sum(e2.age) /count(*)) as average_age from Employees e1
inner join Employees e2 on e1.employee_id = e2.reports_to
group by e1.employee_id
having count(*) > 0
order by e1.employee_id

-- Second solution

select e1.employee_id, e1.name, count(*) as reports_count, round(sum(e2.age) /count(*)) as average_age from Employees e1, Employees e2
where e1.employee_id = e2.reports_to
group by 1
having reports_count > 0
order by 1