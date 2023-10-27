Create table If Not Exists Logs (id int, num int)
Truncate table Logs
insert into Logs (id, num) values ('1', '1')
insert into Logs (id, num) values ('2', '1')
insert into Logs (id, num) values ('3', '1')
insert into Logs (id, num) values ('4', '2')
insert into Logs (id, num) values ('5', '1')
insert into Logs (id, num) values ('6', '2')
insert into Logs (id, num) values ('7', '2')

-- First Solution

select distinct cn1.num as ConsecutiveNums from Logs cn1
where cn1.num = (
    select cn2.num from Logs cn2 where cn2.id = cn1.id + 1
) and cn1.num = (
    select cn2.num from Logs cn2 where cn2.id = cn1.id + 2
)

-- Second solution

select distinct cn1.num as ConsecutiveNums from Logs cn1
inner join Logs cn2 on cn2.id = cn1.id + 1
inner join Logs cn3 on cn3.id = cn1.id + 2
where cn1.num = cn2.num and cn1.num = cn3.num

-- Third solution (much more faster)

select distinct cn1.num as ConsecutiveNums from Logs cn1
inner join Logs cn2 on cn2.id = cn1.id + 1 and cn1.num = cn2.num
inner join Logs cn3 on cn3.id = cn1.id + 2 and cn1.num = cn3.num