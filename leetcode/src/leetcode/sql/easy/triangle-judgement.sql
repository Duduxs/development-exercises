Create table If Not Exists Triangle (x int, y int, z int)
Truncate table Triangle
insert into Triangle (x, y, z) values ('13', '15', '30')
insert into Triangle (x, y, z) values ('10', '20', '15')

-- First Solution

select x, y, z, (case when x < y + z and y < x + z and z < x + y then 'Yes' else 'No' end) as triangle from Triangle