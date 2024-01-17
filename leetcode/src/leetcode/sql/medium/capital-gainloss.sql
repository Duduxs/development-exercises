Create Table If Not Exists Stocks (stock_name varchar(15), operation ENUM('Sell', 'Buy'), operation_day int, price int)
Truncate table Stocks
insert into Stocks (stock_name, operation, operation_day, price) values ('Leetcode', 'Buy', '1', '1000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '2', '10')
insert into Stocks (stock_name, operation, operation_day, price) values ('Leetcode', 'Sell', '5', '9000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Handbags', 'Buy', '17', '30000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '3', '1010')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '4', '1000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '5', '500')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '6', '1000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Handbags', 'Sell', '29', '7000')
insert into Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '10', '10000')

-- First Solution

select 
    s2.stock_name, 
    (sum(s2.price) - (select sum(s1.price) from Stocks s1 where s1.operation = 'Buy' and s1.stock_name = s2.stock_name)) as capital_gain_loss from Stocks s2
where s2.operation = 'Sell' 
group by s2.stock_name

-- Second Solution

select 
    stock_name, 
    sum(if(operation='Buy', -price, price)) as capital_gain_loss
from Stocks 
group by stock_name
