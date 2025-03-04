create database EX3;

use EX3;

-- 1a

CREATE TABLE CITY(
	CITY_ID INT PRIMARY KEY,
    CITY_NAME VARCHAR(255)
);


CREATE TABLE CUSTOMER(
	ID INT PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(255),
    CITY_ID INT,
    FOREIGN KEY (CITY_ID) REFERENCES CITY(CITY_ID),
    CUSTOMER_ADDRESS VARCHAR(255),
    CONTACT_PERSON VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(128),
    PHONE VARCHAR(128)
);


CREATE TABLE PRODUCT(
	ID INT PRIMARY KEY AUTO_INCREMENT,
    SKU VARCHAR(32),
    PRODUCT_NAME VARCHAR(128),
    PRODUCT_DESCRIPTION TEXT,
    CURRENT_PRICE DECIMAL(8,2),
    QUANTITY_IN_STOCK INT
);


CREATE TABLE INVOICE(
	ID INT PRIMARY KEY,
    INVOICE_NUMBER VARCHAR(255),
    CUSTOMER_ID INT,
    FOREIGN KEY (ID) REFERENCES CUSTOMER(ID),
    USER_ACCOUNT_ID INT,
    TOTAL_PRICE DECIMAL(8,2),
    TIME_ISSUED DATETIME NOT NULL,
    TIME_DUE DATETIME NOT NULL,
    TIME_PAID DATETIME NOT NULL,
    TIME_CANCELED DATETIME NOT NULL,
    TIME_REFUNDED DATETIME NOT NULL
);

CREATE TABLE INVOICE_ITEM(
	ID INT PRIMARY KEY,
    INVOICE_ID INT,
    FOREIGN KEY (INVOICE_ID) REFERENCES INVOICE(ID),
    PRODUCT_ID INT,
    FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT(ID),
    QUANTITY INT,
    PRICE DECIMAL(8,2),
    LINE_TOTAL_PRICE DECIMAL(8,2)
);


INSERT INTO CITY (CITY_ID, CITY_NAME) VALUES
	(1, 'VIENNA'),
	(2, 'BERLIN'),
    (3, 'HAMBURG'),
    (4, 'LONDON')
;

-- 1b
INSERT INTO CUSTOMER (ID, CUSTOMER_NAME, CITY_ID, CUSTOMER_ADDRESS, CONTACT_PERSON, EMAIL, PHONE) VALUES
	(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com', '094234234'),
    (2, 'Cosmetics Store', 4, 'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org', '093923923'),
    (3, 'Kosmetikstudio', 3, 'Rothenbaumchaussee 53', 'Willy Brandt', 'willy@kosmetilkstudio.com', '0941562222'),
    (4, 'Neue Kosmetik', 1, 'Karlsplatz 2', 'Neue Kosmetik', 'info@neuekosmetik.com', '094109253'),
    (5, 'Bio Kosmetik', 2, 'MotzstraBe 23', 'Clara Zetkin', 'clara@biokosmetik.com', '094109253'),
    (6, 'K-Wien', 1, 'Karntner StraBe 204', 'Maria Rauch-Kallat', 'maria@kwien.org', '093427002'),
    (7, 'Natural Cosmetics', 4, 'Clerkenwell Road 14B', 'Glenda Jackson', 'glena@natural-cosmetics.com', '093555123'),
    (8, 'Kosmetik Plus', 2, 'Unter den Linden 1', 'Angela Merkel', 'angela@k-plus.com', '094727727'),
    (9, 'New Line Cosmetics', 4, 'Devonshire Street 92', 'Oliver Cromwell', 'oliver@nlc.org', '093202404')
;

INSERT INTO PRODUCT (SKU, PRODUCT_NAME, PRODUCT_DESCRIPTION, CURRENT_PRICE, QUANTITY_IN_STOCK) VALUES
	('330120', 'Game of Thrones - Urban Decay', 'Cosmetic', 65.00, 122),
    ('330121', 'Advanced Night Repair - Estee Lauder', 'Skin care for face', 98.00, 51),
    ('330122', 'Rose Deep Hudration - Fresh', 'Skin care for face', 45.00, 34),
    ('330123', 'Pore-Perfecting Moisturizer - Tatcha', 'Skin care for face', 25.00, 393),
    ('330124', 'Capture Youth - Dior', 'Skin care for face', 95.00, 74),
    ('330125', 'Slice of Glow - Glow Recipe', 'Skin care for face', 45.00, 40),
    ('330126', 'Healthy Skin - Kiehl S since 1851', 'Skin care for body', 68.00, 154),
    ('330127', 'Power Pair! - IT Cosmetics', 'Skin care for eyes', 80.00, 0),
    ('330128', 'Dewy Skin Mist - Tatcha', 'Skin care for face', 20.00, 281),
    ('330129', 'Silk Pillowcase - Slip', 'Hair accessories', 170.00, 0)
;
    
INSERT INTO INVOICE(ID, INVOICE_NUMBER, CUSTOMER_ID, USER_ACCOUNT_ID, TOTAL_PRICE, TIME_ISSUED, TIME_DUE, TIME_PAID, TIME_CANCELED, TIME_REFUNDED) VALUES
	(1, 'INV2019-001', 7, 4, 1436.00, STR_TO_DATE('2019-07-20 15:05:07', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:05:07', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-25 09:24:12', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME()),
    (2, 'INV2019-002', 9, 2, 1000.00, STR_TO_DATE('2019-07-20 15:07:11', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:07:07', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-20 09:24:12', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME()),
    (3, 'INV2019-003', 3, 2, 360.00, STR_TO_DATE('2019-07-20 15:06:15', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:06:15', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-31 09:24:12', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME()),
    (4, 'INV2019-004', 5, 2, 1675.00, STR_TO_DATE('2019-07-20 15:06:34', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:06:34', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME(), CURRENT_TIME()),
    (5, 'INV2019-005', 6, 2, 9500.00, STR_TO_DATE('2019-07-20 15:06:42', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:06:42', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME(), CURRENT_TIME()),
    (6, 'INV2019-006', 4, 2, 150.00, STR_TO_DATE('2019-07-20 15:08:15', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:08:15', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 13:42:45', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), STR_TO_DATE('2019-07-27 14:11:20', '%Y-%m-%d %H:%i:%s'))
;


INSERT INTO INVOICE_ITEM VALUES
	(1, 1, 1, 20, 65.00, 1300.00),
    (2, 1, 7, 2, 68.00, 136.00),
    (3, 2, 5, 10, 10.00, 1000.00),
    (4, 3, 10, 2, 180.00, 360.00),
    (5, 4, 1, 5, 65.00, 325.00),
    (6, 4, 2, 10, 95.00, 950.00),
    (7, 4, 5, 4, 100.00, 400.00),
    (8, 5, 10, 100, 95.00, 9500.00),
    (9, 6, 4, 6, 25.00, 150.00)
;


-- 1c
-- each customer without an invoice
SELECT C.ID AS CUSTOMER_ID, C.CUSTOMER_NAME, I.INVOICE_NUMBER
FROM CUSTOMER C LEFT JOIN INVOICE I
ON C.ID = I.CUSTOMER_ID
WHERE I.CUSTOMER_ID IS NULL
ORDER BY C.ID
;

-- X
-- each product without an invoice
SELECT P.ID, P.PRODUCT_NAME, II.INVOICE_ID
FROM PRODUCT P LEFT JOIN INVOICE_ITEM II
ON P.ID = II.PRODUCT_ID
WHERE P.ID IS NULL
ORDER BY P.ID
;

SELECT II.PRODUCT_ID, I.INVOICE_NUMBER
FROM INVOICE I LEFT JOIN INVOICE_ITEM II
ON I.ID = II.INVOICE_ID
WHERE II.INVOICE_ID IS NULL
;

-- 1c ans
select 'customer', c.id, c.customer_name
from customer c
where not exists (select *
	from invoice i
    where i.customer_id = c.id)
union
select 'product', p.id, p.product_name
from product p
where not exists (select * 
	from invoice_item t
    where t.product_id = p.id);

-- 2
CREATE TABLE DEPARTMENT (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    DEPT_CODE VARCHAR(3) NOT NULL, 
	DEPT_NAME VARCHAR(200) NOT NULL
);

CREATE TABLE EMPLOYEE (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR(30) NOT NULL,
    SALARY NUMERIC(8, 2),
    PHONE NUMERIC(15),
    EMAIL VARCHAR(50),
    DEPT_ID INTEGER NOT NULL,
    FOREIGN KEY (ID) REFERENCES DEPARTMENT(ID)
);

-- 2a
INSERT INTO DEPARTMENT (ID, DEPT_CODE, DEPT_NAME) VALUES
	(1, 'HR', 'HUMAN RESOURCES'),
    (2, '9UP', '9UP DEPARTMENT'),
    (3, 'SA', 'SALES DEPARTMENT'),
    (4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT')
;

INSERT INTO EMPLOYEE (ID, EMPLOYEE_NAME, SALARY, PHONE, EMAIL, DEPT_ID) VALUES
	(1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL.COM', 1),
	(2, 'MARY', 10000, 90234561, 'MARY@GMAIL.COM', 1),
    (3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL.COM', 3),
    (4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL.COM', 4)
;


SELECT D.DEPT_CODE, COUNT(E.DEPT_ID) AS NUMBER_OF_EMPLOYEES
FROM DEPARTMENT D LEFT JOIN EMPLOYEE E
ON D.ID = E.DEPT_ID
GROUP BY D.DEPT_CODE
ORDER BY D.DEPT_CODE
;

-- 2b
INSERT INTO DEPARTMENT VALUES
	(5, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT')
;
DELETE FROM DEPARTMENT WHERE ID = 5;

-- ?
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


-- **
select * from city;
select * from customer;
select * from product;
select * from invoice;
select * from invoice_item;

select * from department;
select * from employee;

drop table invoice_item;
drop database EX3;