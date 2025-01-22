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
    dob date
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
    amount integer,
    order_date date,
    customer_id varchar(20)
)






