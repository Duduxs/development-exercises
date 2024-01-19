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

-- Second Solution

with 
	products_with_closest_date as (
		select product_id, max(change_date) as change_date from Products
		where change_date <= '2019-08-16'
		group by product_id
	),
	products_with_overtaken_date as (
		select product_id, 10 as price from Products
		group by product_id
		having min(change_date) > '2019-08-16'
	)
select * from products_with_overtaken_date
union 
select product_id, new_price as price from Products
inner join products_with_closest_date x using (product_id, change_date);

-- Third solution (without using distinct therefore only union all not union)

with 
	products_with_closest_date as (
		select product_id, max(change_date) as change_date from Products
		where change_date <= '2019-08-16'
		group by product_id
	),
	products_with_overtaken_date as (
		select product_id, 10 as price from Products
		group by product_id
		having min(change_date) > '2019-08-16'
	)
select * from products_with_overtaken_date
union all
select product_id, new_price as price from Products
inner join products_with_closest_date x using (product_id, change_date);

