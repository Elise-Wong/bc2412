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
    FOREIGN KEY (ID) REFERENCES INVOICE(ID),
    PRODUCT_ID INT,
    FOREIGN KEY (ID) REFERENCES PRODUCT(ID),
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
	(1, 'INV2019-001', 7, 2, 1436.00, STR_TO_DATE('2019-07-20 15:05:07', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-27 15:05:07', '%Y-%m-%d %H:%i:%s'), STR_TO_DATE('2019-07-25 09:24:12', '%Y-%m-%d %H:%i:%s'), CURRENT_TIME(), CURRENT_TIME())
;

-- X
INSERT INTO INVOICE_ITEM(ID, INVOICE_ID, PRODUCT_ID, QUANTITY, PRICE, LINE_TOTAL_PRICE) VALUES
	(1, 1, 1, 20, 65.00, 1300),
    (2, 1, 7, 2, 68.00, 136),
    (3, 1, 5, 10, 10.00, 1000),
    (4, 3, 10, 2, 180.00, 360),
    (5, 4, 1, 5, 65.00, 325),
    (6, 4, 2, 10, 95.00, 950),
    (7, 4, 5, 4, 100.00, 400),
    (8, 5, 10, 100, 95.00, 9500),
    (9, 6, 4, 6, 25.00, 150)
;

-- **
select * from city;
select * from customer;
select * from product;
select * from invoice;
select * from invoice_item;

drop database EX3;