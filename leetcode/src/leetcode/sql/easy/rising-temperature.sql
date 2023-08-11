Create table If Not Exists Weather (id int, recordDate date, temperature int);
Truncate table Weather;
insert into Weather (id, recordDate, temperature) values ('1', '2015-01-01', '10');
insert into Weather (id, recordDate, temperature) values ('2', '2015-01-02', '25');
insert into Weather (id, recordDate, temperature) values ('3', '2015-01-03', '20');
insert into Weather (id, recordDate, temperature) values ('4', '2015-01-04', '30');

-- First Solution
SELECT w2.id from Weather w1, Weather w2 where w2.temperature > w1.temperature and w1.recordDate = date_sub(w2.recordDate, INTERVAL 1 day);

-- Second Solution
SELECT w1.id from Weather w1
inner join Weather w2 on w1.recordDate = DATE_ADD(w2.recordDate, interval 1 day)
where w1.temperature > w2.temperature ;