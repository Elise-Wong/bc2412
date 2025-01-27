create database EX1;

use EX1;

create table regions(
	region_id int Primary Key auto_increment,
    region_name varchar(25) not null
);

create table countries(
	country_id varchar(2) not null Primary Key,
    country_name varchar(40) not null,
    region_id int,
    Foreign Key (region_id) references regions(region_id)
);

create table locations(
	location_id int Primary Key auto_increment,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    Foreign Key (country_id) references countries(country_id)
);

create table departments(
	department_id int Primary Key auto_increment,
    department_name varchar(30) not null,
    manager_id int,
    location_id int,
    Foreign Key (location_id) references locations(location_id)
);

create table jobs(
	job_id varchar(10) Primary Key,
    job_title varchar(35),
    min_salary int,
    max_salary int
);

create table employees(
	employee_id int Primary Key auto_increment,
    first_name varchar(20) not null,
    last_name varchar(25) not null,
    email varchar(25) unique,
    phone_number varchar(20) unique,
    hire_date date,
    job_id varchar(10),
    Foreign Key (job_id) references jobs(job_id),
    salary int,
    commission_pct int,
    manager_id int,
    department_id int,
    Foreign Key (department_id) references departments(department_id)
);

create table job_history(
	employee_id int,
	Foreign Key (employee_id) references employees(employee_id),
    start_date date Primary Key,
    end_date date,
    job_id varchar(10),
    department_id int,
    Foreign Key (job_id) references jobs(job_id),
    Foreign Key (department_id) references departments(department_id)
);

create table job_grades(
	grade_level varchar(2) Primary Key,
    lowest_sal int,
    highest_sal int
);

drop table regions;
drop table countries;
drop table locations;
drop table departments;
drop table jobs;
drop table employees;
drop table job_history;
drop table job_grades;

drop database Ex1;