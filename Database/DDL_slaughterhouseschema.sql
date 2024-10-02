-- Drop and create the schema
DROP SCHEMA pro3_slaughterhouse CASCADE;
CREATE SCHEMA IF NOT EXISTS pro3_slaughterhouse;
SET SCHEMA 'pro3_slaughterhouse';


CREATE TABLE Animal (
                        animal_id SERIAL UNIQUE,
                        weight_kilogram DECIMAL(10, 5),
                        PRIMARY KEY (animal_id)
);


CREATE TABLE PartType (
                          type_id SERIAL UNIQUE,
                          "desc" VARCHAR(200),
                          PRIMARY KEY (type_id)
);


CREATE TABLE AnimalPart (
                            part_id SERIAL UNIQUE,
                            weight_kilogram DECIMAL(10,5),
                            animal_id int,
                            type_id int,
                            PRIMARY KEY (part_id),
                            FOREIGN KEY (animal_id) REFERENCES Animal(animal_id),
                            FOREIGN KEY (type_id) REFERENCES PartType(type_id)
);


CREATE TABLE Product (
                         product_id SERIAL UNIQUE,
                         part_id int,
                         PRIMARY KEY (product_id, part_id),
                         FOREIGN KEY (part_id) REFERENCES AnimalPart(part_id)
);


CREATE TABLE Tray (
                      tray_id SERIAL UNIQUE,
                      product_id int,
                      PRIMARY KEY (tray_id, product_id),
                      FOREIGN KEY (product_id) REFERENCES Product(product_id)
);
