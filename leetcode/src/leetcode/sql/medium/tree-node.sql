Create table If Not Exists Tree (id int, p_id int)
Truncate table Tree
insert into Tree (id, p_id) values ('1', 'None')
insert into Tree (id, p_id) values ('2', '1')
insert into Tree (id, p_id) values ('3', '1')
insert into Tree (id, p_id) values ('4', '2')
insert into Tree (id, p_id) values ('5', '2')

-- First Solution

select t.id, 'Inner' as type from Tree t
where t.id in (select t2.p_id from Tree t2) and t.p_id is not null
union all
select t.id, 'Leaf' as type from Tree t
where t.p_id is not null and t.id not in (select t2.p_id from Tree t2 where t2.p_id is not null)
union all 
select t.id, 'Root' as type from Tree t
where t.p_id is null

-- Second Solution
select id, IF(
    p_id is NULL, 
    'Root', 
    IF(id IN (select distinct p_id from Tree), 'Inner', 'Leaf')
) as type from Tree