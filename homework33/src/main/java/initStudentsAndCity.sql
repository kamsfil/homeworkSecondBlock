CREATE DATABASE homework;

USE homework;

CREATE TABLE  IF NOT EXISTS students(
    id bigint primary key auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    courses int,
    faculty varchar(50)
);

INSERT INTO students (first_name, last_name, courses, faculty)
VALUES
    ('Alicia','Spinnet',4,'Griffindor'),
    ('Arabella','Doreen',1,'Ravenclaw'),
    ('Ariana','Dumbledore',1,'Hufflepuff'),
    ('Albus','Dumbledore',5,'Griffindor'),
    ('Arcturus','Black',3,'Hufflepuff'),
    ('Arnold','Peasegood',4,'Griffindor'),
    ('Antonin','Dolohov',3,'Slytherin'),
    ('Alecto','Carrow',3,'Slytherin'),
    ('Arthur','Weasley',5,'Ravenclaw');

CREATE TABLE IF NOT EXISTS city (
    id bigint primary key auto_increment,
    town varchar(50)
);

INSERT INTO city (town)
VALUES
    ('Abidjan'),
    ('Geneva'),
    ('Lanzhou'),
    ('Montreal'),
    ('Riga'),
    ('Sofia'),
    ('Tbilisi'),
    ('Utrecht'),
    ('Harbin');


ALTER TABLE students
ADD COLUMN  address_id bigint,
ADD FOREIGN KEY fk_address(address_id) REFERENCES city(id);



SELECT students.first_name, students.last_name, city.town
FROM students
JOIN city ON students.address_id = city.id;

