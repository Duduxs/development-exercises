Create table If Not Exists Students (student_id int, student_name varchar(20))
Create table If Not Exists Subjects (subject_name varchar(20))
Create table If Not Exists Examinations (student_id int, subject_name varchar(20))
Truncate table Students
insert into Students (student_id, student_name) values ('1', 'Alice')
insert into Students (student_id, student_name) values ('2', 'Bob')
insert into Students (student_id, student_name) values ('13', 'John')
insert into Students (student_id, student_name) values ('6', 'Alex')
Truncate table Subjects
insert into Subjects (subject_name) values ('Math')
insert into Subjects (subject_name) values ('Physics')
insert into Subjects (subject_name) values ('Programming')
Truncate table Examinations
insert into Examinations (student_id, subject_name) values ('1', 'Math')
insert into Examinations (student_id, subject_name) values ('1', 'Physics')
insert into Examinations (student_id, subject_name) values ('1', 'Programming')
insert into Examinations (student_id, subject_name) values ('2', 'Programming')
insert into Examinations (student_id, subject_name) values ('1', 'Physics')
insert into Examinations (student_id, subject_name) values ('1', 'Math')
insert into Examinations (student_id, subject_name) values ('13', 'Math')
insert into Examinations (student_id, subject_name) values ('13', 'Programming')
insert into Examinations (student_id, subject_name) values ('13', 'Physics')
insert into Examinations (student_id, subject_name) values ('2', 'Math')
insert into Examinations (student_id, subject_name) values ('1', 'Math')

-- First solution

select s.student_id , s.student_name , su.subject_name, count(e.subject_name) as attended_exams from Students s 
inner join Subjects su on 1=1
left join Examinations e on s.student_id = e.student_id and e.subject_name = su.subject_name 
group by s.student_id , s.student_name, su.subject_name 
order by s.student_id, su.subject_name ;

-- Second solution

select s.student_id , s.student_name , su.subject_name, count(e.subject_name) as attended_exams from Students s 
cross join Subjects su
left join Examinations e on s.student_id = e.student_id and e.subject_name = su.subject_name 
group by s.student_id , s.student_name, su.subject_name 
order by s.student_id, su.subject_name ;