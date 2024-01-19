Create table If Not Exists Employee (id int, salary int)
Truncate table Employee
insert into Employee (id, salary) values ('1', '100')
insert into Employee (id, salary) values ('2', '200')
insert into Employee (id, salary) values ('3', '300')

-- First Solution

select
  (
    case when count(biggest_salaries.SecondHighestSalary) = 1 then null else min(biggest_salaries.SecondHighestSalary) end) as SecondHighestSalary 
    from (
      select distinct salary as SecondHighestSalary from Employee
      order by salary desc
      limit 2) biggest_salaries

-- Second Solution

with biggest_salaries_cte as (
select distinct salary as SecondHighestSalary from Employee 
order by salary desc
limit 2
)
select
(case when count(bsc.SecondHighestSalary) = 1 then null else min(bsc.SecondHighestSalary) end) as SecondHighestSalary 
from biggest_salaries_cte bsc

-- Third Solution

select max(salary) as SecondHighestSalary from Employee where salary <> (select max(salary) from Employee)