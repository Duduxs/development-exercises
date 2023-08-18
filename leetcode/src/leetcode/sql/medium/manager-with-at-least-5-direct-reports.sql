Create table If Not Exists Employee (id int, name varchar(255), department varchar(255), managerId int)
Truncate table Employee
insert into Employee (id, name, department, managerId) values ('101', 'John', 'A', 'None')
insert into Employee (id, name, department, managerId) values ('102', 'Dan', 'A', '101')
insert into Employee (id, name, department, managerId) values ('103', 'James', 'A', '101')
insert into Employee (id, name, department, managerId) values ('104', 'Amy', 'A', '101')
insert into Employee (id, name, department, managerId) values ('105', 'Anne', 'A', '101')
insert into Employee (id, name, department, managerId) values ('106', 'Ron', 'B', '101')

-- First solution
select name from Employee e where (select count(*) >= 5 from Employee e2 where e2.managerId = e.id);

-- Second solution

select e2.name from Employee e 
cross join Employee e2 on e.managerId = e2.id 
group by e.managerId, e2.name 
having count(*) >= 5;

-- Third solution

select e2.name from Employee e 
inner join Employee e2 on e.managerId = e2.id 
group by e.managerId, e2.name 
having count(*) >= 5;

-- Fourth solution

select e2.name from Employee e, Employee e2 where e.managerId = e2.id
group by e.managerId, e2.name 
having count(*) >= 5;


