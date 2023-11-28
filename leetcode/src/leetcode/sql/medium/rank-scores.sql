Create table If Not Exists Scores (id int, score DECIMAL(3,2))
Truncate table Scores
insert into Scores (id, score) values ('1', '3.5')
insert into Scores (id, score) values ('2', '3.65')
insert into Scores (id, score) values ('3', '4.0')
insert into Scores (id, score) values ('4', '3.85')
insert into Scores (id, score) values ('5', '4.0')
insert into Scores (id, score) values ('6', '3.65')

-- First Solution

select score, dense_rank() over(order by score desc) as rank from Scores;

-- Second Solution

with score_cte as (
    select 
        score,
        row_number() over(order by score desc) as ranked_score
    from Scores
    group by score
    order by score desc
)

select s.score, ranked_score as rank
from Scores s
inner join score_cte using(score)
order by s.score desc
;