Create table If Not Exists Employees (employee_id int, name varchar(20), manager_id int, salary int)
Truncate table Employees
insert into Employees (employee_id, name, manager_id, salary) values ('3', 'Mila', '9', '60301')
insert into Employees (employee_id, name, manager_id, salary) values ('12', 'Antonella', 'None', '31000')
insert into Employees (employee_id, name, manager_id, salary) values ('13', 'Emery', 'None', '67084')
insert into Employees (employee_id, name, manager_id, salary) values ('1', 'Kalel', '11', '21241')
insert into Employees (employee_id, name, manager_id, salary) values ('9', 'Mikaela', 'None', '50937')
insert into Employees (employee_id, name, manager_id, salary) values ('11', 'Joziah', '6', '28485')

-- First Solution

select e1.employee_id from Employees e1
where e1.salary < 30000 and e1.manager_id is not null and (
    e1.manager_id not in (select e2.employee_id from Employees e2 where e2.employee_id = e1.manager_id)
)
order by 1 asc;

-- Second Solution (lower performance due to not having where, in other words binary search by index)

select e1.employee_id from Employees e1
where e1.salary < 30000 and e1.manager_id is not null and (
e1.manager_id not in (select e2.employee_id from Employees e2)
)
order by e1.employee_id;