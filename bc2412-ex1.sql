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


insert into regions (region_id, region_name)
	values (1, 'Europe');
insert into regions (region_id, region_name)
	values (2, 'America');
insert into regions (region_id, region_name)
	values (3, 'Asia');


insert into countries (country_id, country_name, region_id)
	values ('DE', 'Germany', 1);
insert into countries (country_id, country_name, region_id)
    values ('IT', 'Italy', 1);
insert into countries (country_id, country_name, region_id)
    values ('JP', 'Japan', 3);
insert into countries (country_id, country_name, region_id)
    values ('US', 'United State', 2);
    

insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1000, '1297 Via Coila di Rie', '989', 'Roma', '', 'IT');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1100, '93091 Calle della Te', '10934', 'Venice', '', 'IT');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1200, '2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo', 'JP');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1400, '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas', 'US');
    
    
insert into departments (department_id, department_name, manager_id, location_id)
	values (10, 'Administration', 200, 1100);
insert into departments (department_id, department_name, manager_id, location_id)
	values (20, 'Marketing', 201, 1200);
insert into departments (department_id, department_name, manager_id, location_id)
	values (30, 'Purchasing', 202, 1400);


insert into jobs (job_id, job_title, min_salary, max_salary)
	values ('ST_CLERK', 'Administration Clerk', 24000, 24000);
insert into jobs (job_id, job_title, min_salary, max_salary)
	values ('MK_REP', 'Marketing Representative', 9000, 17000);
insert into jobs (job_id, job_title, min_salary, max_salary)
	values ('IT_PROG', 'IT Programmer', 17000, 17000);
insert into jobs (job_id, job_title, min_salary, max_salary)
	values ('MK_MGR', 'Marketing Representative', 90000, 170000);


insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0, 109, 10);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000, 0, 103, 20);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROG', 17000, 0, 108, 30);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567', '1987-06-20', 'MK_REP', 9000, 0, 105, 20);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (104, 'Ann', 'Hu', 'ANNHU', '590-4234568', '1987-06-21', 'MK_MGR', 90000, 0, 201, 20);
    
    
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
	values (102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
	values (101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
	values (101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
	values (100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
	values (102, '1998-03-24', '1999-12-31', 'MK_REP', 20);
    
    
-- line 6, point 3
select l.location_id, l.street_address, l.city, l.state_province, c.country_name
from locations l left join countries c
on l.country_id = c.country_id
;

-- line 7, point 4
select first_name, last_name, department_id
from employees
;

-- line 8, point 5
with work_countries as(
	select l.location_id, c.country_name, l.country_id
	from locations l inner join countries c
	on l.country_id = c.country_id
), work_place as(
	select d.department_id, d.location_id, e.first_name, e.last_name, e.job_id
    from departments d inner join employees e
    on d.department_id = e.department_id
)
select wp.first_name, wp.last_name, wp.job_id, wp.department_id
from work_countries wc inner join work_place wp
on wc.location_id = wp.location_id
where wc.country_name = 'Japan'
;

-- line 9, point 6
select e.employee_id, e.last_name, e.manager_id, m.last_name as manager_last_name
from employees e left join employees m
on e.manager_id = m.manager_id
;


-- line 10, point 7
select e.first_name, e.last_name, e.hire_date
from employees e, employees d
where e.hire_date > d.hire_date -- '1987-06-19'
and d.last_name = 'De Haan'
;

-- line 11, point 8
select d.department_name, e.department_id
, count(1) as number_of_employees
from departments d inner join employees e
on d.department_id = e.department_id
group by e.department_id
;

-- line 12, point 9
select h.employee_ID, j.job_title
, end_date - start_date as number_of_days
from job_history h inner join jobs j
on h.job_id = j.job_id
where h.department_id = 30
;

-- line 13, point 10
with work_countries as(
	select l.location_id, l.city, c.country_name, l.country_id
	from locations l inner join countries c
	on l.country_id = c.country_id
), work_place as(
	select d.location_id, d.department_id, d.department_name, d.manager_id 
    , concat(e.first_name, ' ',e.last_name ) as manager_name
    from departments d inner join employees e
	on d.manager_id = e.manager_id
)
select wp.department_name, wp.manager_name, wc.city, wc.country_name
from work_countries wc inner join work_place wp
on wc.location_id = wp.location_id
;

-- line 14 point 11
select d.department_name, round((avg(e.salary)),2) as average_salary
from employees e inner join departments d
on e.department_id = d.department_id
group by e.department_id
;

-- line 15 point 12



-- **

select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from jobs;
select * from employees;
select * from job_history;
select * from job_grades;

drop database Ex1;