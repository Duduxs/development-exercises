Create table If Not Exists RequestAccepted (requester_id int not null, accepter_id int null, accept_date date null)
Truncate table RequestAccepted
insert into RequestAccepted (requester_id, accepter_id, accept_date) values ('1', '2', '2016/06/03')
insert into RequestAccepted (requester_id, accepter_id, accept_date) values ('1', '3', '2016/06/08')
insert into RequestAccepted (requester_id, accepter_id, accept_date) values ('2', '3', '2016/06/08')
insert into RequestAccepted (requester_id, accepter_id, accept_date) values ('3', '4', '2016/06/09')

-- First Solution

select sub.id, sum(sub.num) as num from (select requester_id as id, count(*) as num from RequestAccepted
group by requester_id union all
select accepter_id as id, count(*) as num from RequestAccepted
group by accepter_id) as sub
group by sub.id
order by num desc
limit 1;

-- Second solution with common table expressions

with cte_users_id as (
  select requester_id as id from RequestAccepted union all select accepter_id as id from RequestAccepted
)
select id, count(*) as num from cte_users_id 
group by id
order by num desc
limit 1;