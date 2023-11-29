Create table If Not Exists Employee (id int, name varchar(255), salary int, managerId int)
Truncate table Employee
insert into Employee (id, name, salary, managerId) values ('1', 'Joe', '70000', '3')
insert into Employee (id, name, salary, managerId) values ('2', 'Henry', '80000', '4')
insert into Employee (id, name, salary, managerId) values ('3', 'Sam', '60000', 'None')
insert into Employee (id, name, salary, managerId) values ('4', 'Max', '90000', 'None')

-- First Solution

select e.name as Employee from Employee e 
where e.salary > (select e2.salary from Employee e2 where e2.id = e.managerId)

-- Second Solution

select e.name as Employee from Employee e 
inner join Employee e2 on e.managerId = e2.id
where e.salary > e2.salary