CREATE TABLE Adopters (
    id INT PRIMARY KEY,
    name VARCHAR(30),
    age INT
);

select * from adopters;
drop table adopters;

CREATE TABLE Cats (
    id INT PRIMARY KEY,
    breed VARCHAR(50),
    adopter_id INT, -- by default, FK allows null value
    FOREIGN KEY (adopter_id) REFERENCES Adopters (id)
);

select * from cats;
drop table cats;

INSERT INTO Adopters (id, name, age)
VALUES
    (1, 'Cherry', 30),
    (2, 'Steve', 22),
    (3, 'Cindy', 18);

INSERT INTO Cats (id, breed, adopter_id)
VALUES
    (1, 'persion', 2),
    (2, 'rogdoll', 1),
    (3, 'persion', null),
    (4, 'sphynx', 1);