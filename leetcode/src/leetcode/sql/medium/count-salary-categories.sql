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
