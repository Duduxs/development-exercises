Create table If Not Exists Employee (id int, name varchar(255), salary int, departmentId int)
Create table If Not Exists Department (id int, name varchar(255))
Truncate table Employee
insert into Employee (id, name, salary, departmentId) values ('1', 'Joe', '70000', '1')
insert into Employee (id, name, salary, departmentId) values ('2', 'Jim', '90000', '1')
insert into Employee (id, name, salary, departmentId) values ('3', 'Henry', '80000', '2')
insert into Employee (id, name, salary, departmentId) values ('4', 'Sam', '60000', '2')
insert into Employee (id, name, salary, departmentId) values ('5', 'Max', '90000', '1')
Truncate table Department
insert into Department (id, name) values ('1', 'IT')
insert into Department (id, name) values ('2', 'Sales')

-- First Solution

select d.name as Department, e.name as Employee, e.salary as Salary from Employee e
inner join Department d on e.departmentId = d.id
where e.salary = (select max(e2.salary) from Employee e2 where e2.departmentId = e.departmentId)
group by e.departmentId, e.name

-- Second Solution

select d.name as Department, e.name as Employee, e.salary as Salary from Employee e
inner join Department d on e.departmentId = d.id
where e.salary = (select max(e2.salary) from Employee e2 where e2.departmentId = e.departmentId)

-- Third Solution

select d.name as Department, e.name as Employee, e.salary as Salary from Employee e
inner join Department d on e.departmentId = d.id and (e.departmentId, e.salary) in (
    select e2.departmentId, max (e2.salary) from Employee e2 group by e2.departmentId
)