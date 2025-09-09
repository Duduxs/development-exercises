Create table If Not Exists Users (user_id int, email varchar(255));
INSERT INTO Users (user_id, email)
VALUES (1, 'alice@example.com'),
       (2, 'bob_at_example.com'),
       (3, 'charlie@example.net'),
       (4, 'david@domain.com'),
       (5, 'eve@invalid'),
       (6, '6FZrsK_.doE@gmail.com'),
       (7, 'john.doe@example.com');

select * from Users
where email like '%@%'
  and email like '%.com'
  and SUBSTRING_INDEX(email, '@', 1) REGEXP '^[A-Za-z0-9_]+$'
and SUBSTRING_INDEX(SUBSTRING_INDEX(email, '@', -1), '.com', 1) REGEXP '^[A-Za-z]+$';
