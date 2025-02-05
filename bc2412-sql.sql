-- this is a comment line
-- MySQLWorkbench is a client side -> connect (IP/port/id/password) -> MySQL Server (7days*24hr)
-- MySQL DMBS is case insensitive (大小階的名都是一樣, 與java不一樣)
-- this is client side

create database bc2412;

-- Use database
use bc2412;

-- My SQL Server may contains many databases, one database may contains many tables
-- varchar = String
create table customers (
	id integer,
	first_name varchar(20), 
    last_name varchar(20),
    email varchar(50),
    dob date -- yyyy-mm-yy
);

-- * means select all columns
select * from customers;

insert into customers (id, first_name, last_name, email, dob)
values (1, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');

insert into customers (id, first_name, last_name, email, dob)
values (2, 'Lucas', 'Lau', 'lucaslau@gmail.com', '1999-10-31');

insert into customers (id, first_name, last_name, email, dob)
values (3, 'Elise', 'Wong', 'elisewong@gmail.com', '2000-01-10');

-- delete all data from table
delete from customers;

-- delete data by criteria
delete from customers where last_name = 'Wong';

-- select specific columns from table
-- select is to choose columns
select id, first_name, dob from customers;

-- where is to control rows
select id, first_name, dob from customers where dob < '2000-01-01';

-- SELECT doesnt change the data in harddisk. SQL is just using a program to retrieve the data in harddisk.
-- INSERT, DELETE change the data in harddisk.

-- more than 1 criteria
select * from customers where last_name = 'Lau' and dob > '1999-12-01';
select * from customers where last_name = 'Lau' or first_name = 'Sally';

-- AND has higher priority to execute
select * from customers where last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';
select * from customers where (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';

-- Not equals to, better to use <>
select * from customers where last_name != 'Wong';
select * from customers where last_name <> 'Wong';

-- 1ms = 0.001sec

-- order by (default asc)
select * from customers order by first_name;

-- order by asc 由小至大
select * from customers order by first_name asc;

-- order by desc 由大至小 (~0.38ms)
select * from customers order by first_name desc;
select * from customers where dob > '2000-01-01' order by id desc; -- Java: steam.filter().sorted()

-- table: orders
-- id, amount, order_date, customer_id
create table orders (
	id integer,
    amount decimal(13,2), -- 11 is for integer digit, 2 is for deimcal places, total 13
    order_date datetime, -- yyyy-mm-yy hh:mm:ss0000000000
    customer_id integer
);
select * from orders;

-- delete hold table
drop table orders;

insert into orders (id, amount, order_date, customer_id) 
values (1, 100.9, str_to_date('2020-12-31 23:10:59', '%Y-%m-%d %H:%i:%s'), 1);

insert into orders (id, amount, order_date, customer_id) 
values (2, 999.9, current_time(), 3);

insert into orders (id, amount, order_date, customer_id) 
values (3, 1999.2, current_time(), 3);

insert into orders values 
		(4, 9999.9, current_time(), 3),
		(5, 12000, current_time(), 3),
        (6, 15000, current_time(), 3);



-- sum(), avg(), max(), min(), count() : aggregate function -> result data structure changed
-- only 1 row
select sum(amount) from orders;
select avg(amount) from orders;
select max(amount) from orders;
select min(amount) from orders;
select count(amount) from orders;

-- NOT OK: data structure are not same
select sum(amount), id from orders;

-- OK
-- as can let java to get the name
-- static method
select sum(amount) as total_amt
	, round(avg(amount),2) as avg_amt
	, max(amount) as highest_amt
	, min(amount) as lowest_amt
	, count(amount) as order_count
	, 1
    'hello' 
	from orders
	where amount > 1000;

-- SQL sequence, step
-- 1. from
-- 2. where
-- 3. group by (having)
-- 4. order by
-- 5. select columns

-- Math
-- ignore decimal places
-- o is the nickname of orders
select floor(o.amount), o.* from orders o; -- down to nearest integer 
select ceil(o.amount), o.* from orders o; -- up to nearest integer
select abs(-4), abs(4) from dual;

-- String
select concat(c.first_name, ' ', c.last_name) as full_name, c.* from customers c;

select concat(c.first_name, ' ', c.last_name) as full_name
, length(c.last_name) as length_of_lastname
, upper(c.first_name) as uppercase_firstname
, lower(c.first_name) as lowercase__firstname
, replace(c.email, '@', '$') as new_email
, substring(c.first_name, 1, 2) as first_name_initial -- from 1 to 2 -> 出2個字母; not start from 0
, left(c.last_name, 2) as left_lastname
, right(c.last_name, 2) as right_lastname
, instr(c.last_name, 'A') as lastname_contains_cap_letter
, instr(c.last_name, 'a') as lastname_contains_small_letter
, c.*
from customers c;

-- LIKE
-- % means any characters; %與%之間的字母
select *
from customers
where first_name like '%V%';

select *
from customers
where first_name like '%v%'; -- 包括v

select *
from customers
where first_name like '%%'; -- 中間冇字母

select *
from customers
where first_name like '%V%T'; -- T 收尾

-- DATE
-- add
select o.*, date_add(o.order_date, interval 3 month) as  follow_up_date
from orders o;
select o.*, date_add(o.order_date, interval 2 year) as  follow_up_date
from orders o;
-- less 3 day
select o.*, date_sub(o.order_date, interval 3 day) as  follow_up_date
from orders o;


-- count(1) = count(*) = counts all
select count(1) from orders o;
select count(*) from orders o;

-- group by... no any detail
-- separate the data into groups, by a column(customer_id)
-- after group by, you can only select the column that you used for "Group"
select customer_id, count(1) as order_count, avg(amount) as average_order_amount
from orders
group by customer_id;  
-- ans: 1 1 -- 3 5

-- from > where > group by > select
select customer_id, sum(amount) as total_order_amt, count(1) as order_count -- select cant use * as the logic issue
-- 可count 1, 但冇sum 1
from orders
where amount < 5000
group by customer_id;

-- Database Type: Relational DB(Structure -> Schemas (tabale's defination) -> row x column)
-- JOIN (customers x orders)
-- 1. find order count by customer, show first_name and last_name and orderd count

-- inner join
-- 3 customers x 6 orders = 18 rows
select c.*, o.*
from customers c inner join orders o;
-- on: filter sth
select c.*, o.*
from customers c inner join orders o on o.customer_id = c.id;

select c.first_name, c.last_name, o.amount, o.id as order_id, c.id as customer_id
from customers c inner join orders o on o.customer_id = c.id;

select c.id as customer_id, c.first_name, c.last_name
, count(1) as order_count
, sum(amount) as total_order_amt 
from customers c 
inner join orders o 
on o.customer_id = c.id -- "on" before "join"
group by c.id, c.first_name, c.last_name; -- uniqle field 

select c.id as customer_id, c.first_name, c.last_name
, count(1) as order_count
, sum(amount) as total_order_amt 
from customers c 
inner join orders o 
on o.customer_id = c.id
where o.amount < 5000 -- o.customer_id = c.id -- "where" after "join", but before "group"
group by c.id, c.first_name, c.last_name;

-- function is same as inner join, better than using inner join
select c.id, c.first_name, c.last_name, count(1) as order_count
from customers c, orders o
where c.id = o.customer_id
and o.amount < 5000
group by c.id, c.first_name, c.last_name;

-- on vs where
-- where: is doing 2 tasks, is filter

-- group by + HAVING ...要一齊
-- group by 內某些東西留下
select c.id as customer_id, c.first_name, c.last_name
, count(1) as order_count
from customers c 
inner join orders o 
on o.customer_id = c.id
where o.amount < 5000 -- filter record (rows)
group by c.id, c.first_name, c.last_name
having count(1) > 1 -- after group by -> filter group
order by c.id;

-- distinct
-- distinct column should exist in "group by".
select distinct customer_id
from orders;

select distinct last_name
from customers;

select distinct last_name, first_name
from customers;

insert into customers (id, first_name, last_name, email, dob)
values (4, 'Vincent', 'Lau', 'vincentlau2@gmail.com', '1999-01-31');

select distinct last_name, first_name, count(1)
from customers
group by last_name, first_name;

select distinct id
from customers
group by id;

-- LEFT JOIN
-- show all records of the left table)

-- find all customers with his orders
select c.*, o.*
from customers c left join orders o on c.id = o.customer_id;

select o.*, c.*
from  orders o left join customers c on c.id = o.customer_id;


-- RIGHT JOIN
-- 冇咩用
select c.*, o.*
from customers c right join orders o on c.id = o.customer_id;

select o.*, c.*
from  orders o right join customers c on c.id = o.customer_id;

-- find the customer who didnt place order (use leftjoin, where)
select c.*, o.*
from customers c left join orders o on c.id = o.customer_id
where o.id is null; -- null 要用 is/is not

select *
from orders;

-- add PK for customers
ALTER TABLE customers ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
ALTER TABLE orders ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
-- add FK for orders
ALTER TABLE orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id);

-- Not allowed FK fail
-- insert into orders values (7, 400.0, currenct_time(), 99)

insert into orders (id, amount, order_date, customer_id) 
values (7, 400.0, currenct_time(), 99);

-- many to many table design
-- e.g. students go to exam
CREATE TABLE STUDENTS(
	ID INT PRIMARY KEY AUTO_INCREMENT, -- NOT NULL + UNIQUE + INDEX
	NAME VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(50) UNIQUE -- is it not null?
);

CREATE TABLE SUBJECTS(
	ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL
);

CREATE TABLE STUDENT_SUBJECTS(
	-- ID INT PRIMARY KEY AUTO_INCREMENT,
    STUDENT_ID INT,
    SUBJECT_ID INT,
    PRIMARY KEY (STUDENT_ID, SUBJECT_ID),
    FOREIGN KEY (STUDENT_ID) REFERENCES STUDENTS(ID), -- FK can be Null
    FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS(ID)
);

select * from STUDENTS;
select * from SUBJECTS;
select * from STUDENT_SUBJECTS;

drop table STUDENTS; -- you have to drop the table with FK first
drop table SUBJECTS;
drop table STUDENT_SUBJECTS;

insert into STUDENTS (NAME, EMAIL)
	values ('Ann', 'ann001@gmail.com');
insert into STUDENTS (NAME, EMAIL)
	values ('Ben', 'ben002@gmail.com');
    
insert into SUBJECTS (NAME) values ('Chinese');
insert into SUBJECTS (NAME) values ('English');
insert into SUBJECTS (NAME) values ('History');

insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (1, 3);
insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (1, 2);
insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (1, 1);
insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (2, 3);
insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (2, 2);
insert into STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) value (2, 1);

-- join 3 tables (暗藏innter join)
select st.NAME, su.NAME
from STUDENT_SUBJECTS ss, STUDENTS st, SUBJECTS su
where ss.STUDENT_ID = st.ID
and ss.SUBJECT_ID = su.ID
order by st.NAME
;

-- view
create or replace view vcustomer_orders  -- 紋身咁
as
select c.id as customer_id, c.first_name, c.last_name, c.email, o.amount, o.order_date, o.id as order_id
from customers c inner join orders o on c.id = o.customer_id
;

-- when you select the view:
-- 1. real time execution for the SQL behind the view. / up-to-date, did not save any data
-- 2. when you modify the SQL behind view, you have to re-compile view to take effective.
-- 3. View has its own access right (select), so that we can manage access right of tables across accounts.
select * from vcustomer_orders;

-- alter table 後補table
-- trigger
alter table customers add order_count INT;
select * from customers;
select * from orders;

insert into orders (id, amount, order_date, customer_id) 
values (7, 99.1, current_time(), 1);
insert into orders (id, amount, order_date, customer_id) 
values (8, 100.9, current_time(), 1);
insert into orders (id, amount, order_date, customer_id) 
values (9, 100.9, current_time(), 1);

drop TRIGGER update_order_count;

DELIMITER //

CREATE TRIGGER update_order_count
AFTER INSERT ON orders
FOR EACH ROW
BEGIN
    -- TRIGGER CUSTOMER'S TRIGGER
    UPDATE customers
    SET order_count = ifnull(order_count,0) + 1
    WHERE id = NEW.customer_id;
END;
//

DELIMITER ;

-- audit 睇番改左d咩
select * from customers;

create table table_logs(
	id int primary key auto_increment,
    table_name varchar(50),
    column_name varchar(50),
    old_value varchar(50),
    new_value varchar(50)
);

select * from table_logs;
drop table table_logs;

DELIMITER //

CREATE TRIGGER update_customers_data
AFTER UPDATE ON customers
FOR EACH ROW
BEGIN
    if (old.dob <> new.dob) then
		insert into table_logs (table_name, column_name, old_value, new_value)
        values ('CUSTOMERS', 'DOB', old.dob, new.dob);
	end if;
END;
//

DELIMITER ;

UPDATE CUSTOMERS SET DOB = '2000-01-01' WHERE ID = 1;


