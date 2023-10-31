Create table If Not Exists Customer (customer_id int, name varchar(20), visited_on date, amount int)
Truncate table Customer
insert into Customer (customer_id, name, visited_on, amount) values ('1', 'Jhon', '2019-01-01', '100')
insert into Customer (customer_id, name, visited_on, amount) values ('2', 'Daniel', '2019-01-02', '110')
insert into Customer (customer_id, name, visited_on, amount) values ('3', 'Jade', '2019-01-03', '120')
insert into Customer (customer_id, name, visited_on, amount) values ('4', 'Khaled', '2019-01-04', '130')
insert into Customer (customer_id, name, visited_on, amount) values ('5', 'Winston', '2019-01-05', '110')
insert into Customer (customer_id, name, visited_on, amount) values ('6', 'Elvis', '2019-01-06', '140')
insert into Customer (customer_id, name, visited_on, amount) values ('7', 'Anna', '2019-01-07', '150')
insert into Customer (customer_id, name, visited_on, amount) values ('8', 'Maria', '2019-01-08', '80')
insert into Customer (customer_id, name, visited_on, amount) values ('9', 'Jaze', '2019-01-09', '110')
insert into Customer (customer_id, name, visited_on, amount) values ('1', 'Jhon', '2019-01-10', '130')
insert into Customer (customer_id, name, visited_on, amount) values ('3', 'Jade', '2019-01-10', '150')

-- First Solution
select 
    c1.visited_on, 
    (select sum(c2.amount) from Customer c2 where c2.visited_on <= c1.visited_on and DATEDIFF(c1.visited_on, c2.visited_on) <= 6 ) as amount,
    round((select sum(c2.amount) from Customer c2 where c2.visited_on <= c1.visited_on and DATEDIFF(c1.visited_on, c2.visited_on) <= 6 ) / 7, 2) as average_amount
from Customer c1
group by c1.visited_on
having date_sub(c1.visited_on, interval 6 day) in (select c2.visited_on from Customer c2)
