Create table If Not Exists orders (order_number int, customer_number int)
Truncate table orders
insert into orders (order_number, customer_number) values ('1', '1')
insert into orders (order_number, customer_number) values ('2', '2')
insert into orders (order_number, customer_number) values ('3', '3')
insert into orders (order_number, customer_number) values ('4', '3')

-- First Solution

select distinct customer_number from Orders
where customer_number = (
    select customer_number from Orders 
    group by customer_number
    order by count(*) desc
    limit 1
)

-- Second Solution

  select customer_number from Orders 
    group by customer_number
    order by count(*) desc
    limit 1
