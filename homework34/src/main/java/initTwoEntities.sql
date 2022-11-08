USE homework;

CREATE TABLE  IF NOT EXISTS human(
    id bigint primary key auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    age int
);

INSERT INTO human (first_name, last_name, age)
VALUES
    ('Alicia','Spinnet',52),
    ('Arabella','Doreen',22),
    ('Ariana','Dumbledore',25),
    ('Albus','Dumbledore',14),
    ('Arcturus','Black',17),
    ('Arnold','Peasegood',18),
    ('Antonin','Dolohov',17);

CREATE TABLE IF NOT EXISTS property (
    id bigint primary key auto_increment,
    car varchar(20),
    phone varchar(20),
    PC varchar(20),
    money int
);

INSERT INTO property (car, phone, PC, money)
VALUES
    ('BMW','Iphone','MacBook','50000'),
    ('Audi','Nokia','Samsung','7000'),
    ('Kia','Samsung','HP','32000'),
    ('Reno','Sony','Xiaomi','1000'),
    ('Lada','Oppo','Dell','12000'),
    ('Jip','Google','Lenovo','70000'),
    ('Geely','LG','Toshiba','25500');


ALTER TABLE human
ADD COLUMN  property_id bigint,
ADD FOREIGN KEY fk_property(property_id) REFERENCES property(id);


SELECT human.last_name, human.first_name,human.age, property.car
FROM human
JOIN property ON human.property_id = property.id;