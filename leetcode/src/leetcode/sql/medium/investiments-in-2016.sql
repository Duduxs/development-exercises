Create Table If Not Exists Insurance (pid int, tiv_2015 float, tiv_2016 float, lat float, lon float)
Truncate table Insurance
insert into Insurance (pid, tiv_2015, tiv_2016, lat, lon) values ('1', '10', '5', '10', '10')
insert into Insurance (pid, tiv_2015, tiv_2016, lat, lon) values ('2', '20', '20', '20', '20')
insert into Insurance (pid, tiv_2015, tiv_2016, lat, lon) values ('3', '10', '30', '20', '20')
insert into Insurance (pid, tiv_2015, tiv_2016, lat, lon) values ('4', '10', '40', '40', '40')

-- First solution

select round(sum(i1.tiv_2016),2) as tiv_2016 from Insurance i1
where i1.tiv_2015 in (
    select i2.tiv_2015 from Insurance i2
    where i2.pid != i1.pid
)
and (i1.lat, i1.lon) not in (
    select i2.lat, i2.lon from Insurance i2
    where i2.pid != i1.pid
)

-- Second solution with cte

with insurance_filtered_data_cte as (
select round(sum(i1.tiv_2016),2) as tiv_2016 from Insurance i1
where i1.tiv_2015 in (
    select i2.tiv_2015 from Insurance i2
    where i2.pid != i1.pid
)
and (i1.lat, i1.lon) not in (
    select i2.lat, i2.lon from Insurance i2
    where i2.pid != i1.pid
))
select tiv_2016 from insurance_filtered_data_cte