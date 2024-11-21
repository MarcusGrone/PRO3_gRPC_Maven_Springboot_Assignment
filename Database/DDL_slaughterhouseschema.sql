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
    name    VARCHAR(200),
    PRIMARY KEY (type_id)
);

CREATE TABLE Product
(
    product_id SERIAL UNIQUE,
    PRIMARY KEY (product_id)
);

CREATE TABLE Tray
(
    tray_id   SERIAL UNIQUE,
    type_id   int,
    maxWeight DECIMAL(10, 5),
    PRIMARY KEY (tray_id),
    FOREIGN KEY (type_id) REFERENCES PartType (type_id)
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

-- Insert into Animal
INSERT INTO Animal (weight_kilogram, origin, arrival_date)
VALUES (500.12345, 'Denmark', '2024-01-15'),
       (450.54321, 'Germany', '2024-01-20'),
       (600.98765, 'Denmark', '2024-01-25'),
       (550.56789, 'Sweden', '2024-02-01');

-- Insert into PartType
INSERT INTO PartType (name)
VALUES ('Type1'),
       ('Type2'),
       ('Type3'),
       ('Type4');

-- Insert into Product
INSERT INTO Product
VALUES (DEFAULT), -- Automatically generated ID
       (DEFAULT),
       (DEFAULT),
       (DEFAULT);

-- Insert into Tray
INSERT INTO Tray (type_id, maxWeight)
VALUES (1, 1000.12345),
       (2, 1200.54321),
       (3, 800.98765),
       (4, 1500.56789);

-- Insert into AnimalPart
INSERT INTO AnimalPart (weight_kilogram, animal_id, type_id, product_id, tray_id)
VALUES (50.12345, 1, 1, 1, 1),
       (60.54321, 2, 1, 1, 1),
       (70.98765, 3, 2, 2, 2),
       (80.56789, 4, 3, 3, 3),
       (90.12345, 1, 4, 4, 4),
       (40.54321, 2, 4, 4, 4);
