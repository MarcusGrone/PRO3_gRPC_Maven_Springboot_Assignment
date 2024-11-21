-- Drop and create the schema
DROP SCHEMA pro3_slaughterhouse CASCADE;
CREATE SCHEMA IF NOT EXISTS pro3_slaughterhouse;
SET SCHEMA 'pro3_slaughterhouse';


CREATE TABLE Animal
(
    animal_id       SERIAL UNIQUE,
    weight_kilogram DECIMAL(10, 5),
    origin          VARCHAR(255),
    arrival_date    DATE,
    PRIMARY KEY (animal_id)
);


CREATE TABLE PartType
(
    type_id SERIAL UNIQUE,
    name  VARCHAR(200),
    PRIMARY KEY (type_id)
);


CREATE TABLE AnimalPart
(
    part_id         SERIAL UNIQUE,
    weight_kilogram DECIMAL(10, 5),
    animal_id       int,
    type_id         int,
    product_id      int,
    tray_id         int,
    PRIMARY KEY (part_id),
    FOREIGN KEY (animal_id) REFERENCES Animal (animal_id),
    FOREIGN KEY (type_id) REFERENCES PartType (type_id),
    FOREIGN KEY (product_id) REFERENCES Product (product_id),
    FOREIGN KEY (tray_id) REFERENCES Tray (tray_id)
);


CREATE TABLE Product
(
    product_id SERIAL UNIQUE,
    PRIMARY KEY (product_id)
);



CREATE TABLE Tray
(
    tray_id    SERIAL UNIQUE,
    type_id    int,
    maxWeight  DECIMAL(10,5),
    PRIMARY KEY (tray_id),
    FOREIGN KEY (type_id) REFERENCES PartType(type_id)
);


INSERT INTO Animal (weight_kilogram)
VALUES (500.25),
       (550.10),
       (475.35),
       (600.00),
       (525.50),
       (490.75),
       (510.20),
       (620.80),
       (455.60),
       (580.90);


INSERT INTO PartType (name)
VALUES ('Shoulder'),
       ('Leg'),
       ('Rib'),
       ('Head'),
       ('Loin'),
       ('Neck'),
       ('Belly'),
       ('Ham'),
       ('Foot'),
       ('Tail');


INSERT INTO AnimalPart (weight_kilogram, animal_id, type_id)
VALUES (50.25, 1, 1),
       (45.10, 1, 2),
       (35.75, 2, 3),
       (40.00, 2, 4),
       (30.50, 3, 5),
       (25.75, 4, 6),
       (55.20, 5, 7),
       (60.80, 6, 8),
       (20.60, 7, 9),
       (15.90, 8, 10);
