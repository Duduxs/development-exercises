Create table If Not Exists Employee (Id int, Salary int)
Truncate table Employee
insert into Employee (id, salary) values ('1', '100')
insert into Employee (id, salary) values ('2', '200')
insert into Employee (id, salary) values ('3', '300')

-- First Solution

CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    select distinct sub_query.salary from (
    select  e.salary, DENSE_RANK() over (order by e.salary desc) as salary_row from Employee e order by e.salary desc
    ) as sub_query
    where sub_query.salary_row = n
  );
END;
$$ LANGUAGE plpgsql;