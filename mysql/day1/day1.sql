show databases;
create database student_management;
use student_management;

create table students(
     std_id int primary key,
     std_name varchar(50),
     std_roll int,
     std_email varchar(40)
);

 insert into students(std_id, std_name, std_roll, std_email) values(1, "niki", 101, "niki@gmail.com");

select * from students;
select std_name, std_email from students;

--to add new column with default null
alter table students
add column std_class_room varchar(20);

--to add new column with default some value
alter table students
add column std_class_room varchar(20) default 'cs104';

desc students;

alter table students
drop column std_class_room;

insert into students (std_id, std_name, std_roll, std_email)
values
    (2, 'Jane Smith', '002', 'janesmith@example.com'),
    (3, 'Alice Johnson', '003', 'alicejohnson@example.com'),
    (4, 'Bob Brown', '004', 'bobbrown@example.com'),
    (5, 'Charlie Davis', '005', 'charliedavis@example.com'),
    (6, 'David Miller', '006', 'davidmiller@example.com'),
    (7, 'Eva Taylor', '007', 'evataylor@example.com'),
    (8, 'Frank Anderson', '008', 'frankanderson@example.com'),
    (9, 'Grace Wilson', '009', 'gracewilson@example.com'),
    (10, 'Hannah Moore', '010', 'hannahmoore@example.com');

select * from students limit 2;

select * from students where std_id=2;

--we use offsset and limit in pagination
select * from students limit 3 offset 1;

update students
set std_class_room = 'cs204'
where std_id = 1;

--delete previous row
delete from students
where std_id=2;

delete from students where std_id = 3;

truncate students;

drop table students;

drop database student_management;

