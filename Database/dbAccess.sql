CREATE USER slaughterhouseserver WITH PASSWORD 'CF(3''(]eA,JOty$WssTf^3';

GRANT SELECT ON ALL TABLES IN SCHEMA pro3_slaughterhouse TO slaughterhouseserver;

GRANT INSERT ON ALL TABLES IN SCHEMA pro3_slaughterhouse TO slaughterhouseserver;

GRANT UPDATE ON ALL TABLES IN SCHEMA pro3_slaughterhouse TO slaughterhouseserver;

GRANT DELETE ON ALL TABLES IN SCHEMA pro3_slaughterhouse TO slaughterhouseserver;

GRANT USAGE ON SCHEMA pro3_slaughterhouse TO slaughterhouseserver;

GRANT USAGE, UPDATE, SELECT ON SEQUENCE pro3_slaughterhouse.animal_animal_id_seq TO slaughterhouseserver;
GRANT USAGE, UPDATE, SELECT ON SEQUENCE pro3_slaughterhouse.product_product_id_seq TO slaughterhouseserver;

ALTER DEFAULT PRIVILEGES IN SCHEMA pro3_slaughterhouse
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO slaughterhouseserver;