Create table If Not Exists Seat (id int, student varchar(255))
Truncate table Seat
insert into Seat (id, student) values ('1', 'Abbot')
insert into Seat (id, student) values ('2', 'Doris')
insert into Seat (id, student) values ('3', 'Emerson')
insert into Seat (id, student) values ('4', 'Green')
insert into Seat (id, student) values ('5', 'Jeames')

-- First Solution

select 
    s.id,
    (case when s.id % 2 <> 0
        then case when exists(select su.student from Seat su where su.id = s.id + 1) then (select su.student from Seat su where su.id = s.id + 1) else s.student end
        else (select su.student from Seat su where su.id = s.id - 1)
        end
    ) as student 
from Seat s
order by s.id;

-- Second solution

select 
    s.id,
    (case 
        when s.id % 2 <> 0 and s.id = (select count(*) from Seat) then s.student
        when s.id % 2 <> 0 then (select su.student from Seat su where su.id = s.id + 1)
        else (select su.student from Seat su where su.id = s.id - 1) end
    ) as student
from Seat s
order by s.id;

-- Third solution

select 
    s.id,
    (if
        (s.id % 2 <> 0,
            (select su.student from Seat su where case when s.id = (select count(*) from Seat) then su.id = s.id else su.id = s.id + 1 end),
            (select su.student from Seat su where su.id = s.id - 1)
        )
    ) as student
from Seat s
order by s.id;