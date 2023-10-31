Create table If Not Exists Products (product_id int, new_price int, change_date date)
Truncate table Products
insert into Products (product_id, new_price, change_date) values ('1', '20', '2019-08-14')
insert into Products (product_id, new_price, change_date) values ('2', '50', '2019-08-14')
insert into Products (product_id, new_price, change_date) values ('1', '30', '2019-08-15')
insert into Products (product_id, new_price, change_date) values ('1', '35', '2019-08-16')
insert into Products (product_id, new_price, change_date) values ('2', '65', '2019-08-17')
insert into Products (product_id, new_price, change_date) values ('3', '20', '2019-08-18')

-- First Solution

select p.product_id, 10 as price
from Products p
group by p.product_id 
having min(p.change_date) > '2019-08-16'
union all
select p2.product_id, p2.new_price as price
from Products p2 inner join 
(
	select p3.product_id, max(p3.change_date) as max_date
	from Products p3
	where p3.change_date <= '2019-08-16'
	group by p3.product_id 
) as r
on p2.product_id = r.product_id and p2.change_date  = r.max_date;