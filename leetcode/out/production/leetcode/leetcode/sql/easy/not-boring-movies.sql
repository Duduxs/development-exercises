Create table If Not Exists cinema (id int, movie varchar(255), description varchar(255), rating float(2, 1))
Truncate table cinema
insert into cinema (id, movie, description, rating) values ('1', 'War', 'great 3D', '8.9')
insert into cinema (id, movie, description, rating) values ('2', 'Science', 'fiction', '8.5')
insert into cinema (id, movie, description, rating) values ('3', 'irish', 'boring', '6.2')
insert into cinema (id, movie, description, rating) values ('4', 'Ice song', 'Fantacy', '8.6')
insert into cinema (id, movie, description, rating) values ('5', 'House card', 'Interesting', '9.1')

-- First solution
select id, movie, description, rating
from cinema
where description not like '%boring%' and id % 2 != 0
order by rating desc;

-- Second solution
select id, movie, description, rating
from cinema
where id % 2 != 0 and description not like '%boring%'
order by rating desc;

-- Third solution

SELECT * from Cinema
where mod(id,2) <> 0 AND description <> 'boring'
ORDER BY rating desc;