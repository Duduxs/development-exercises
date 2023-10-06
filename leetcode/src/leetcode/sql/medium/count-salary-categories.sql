Create table If Not Exists Accounts (account_id int, income int)
Truncate table Accounts
insert into Accounts (account_id, income) values ('3', '108939')
insert into Accounts (account_id, income) values ('2', '12747')
insert into Accounts (account_id, income) values ('8', '87709')
insert into Accounts (account_id, income) values ('6', '91796')

-- First Solution
select 'Low Salary' as category, count(*) as accounts_count from Accounts where income < 20000
union all
select 'Average Salary' as category, count(*) as accounts_count from Accounts where income between 20000 and 50000
union all
select 'High Salary' as category, count(*) as accounts_count from Accounts where income > 50000

-- Second Solution (+ performance and readability)

select
    c.category,
    count(a.account_id) as accounts_count
from (
    select 'Low Salary' as category union all
    select 'Average Salary' as category union all
    select 'High Salary' as category
) c
left outer join Accounts a 
    on (
        (c.category = 'Low Salary' and a.income < 20000) ||
        (c.category = 'Average Salary' and a.income between 20000 and 50000) ||
        (c.category = 'High Salary' and a.income > 50000)
    )
group by c.category
