DROP TABLE IF EXISTS todos;
CREATE TABLE todos(id SERIAL PRIMARY KEY, name VARCHAR(255), description VARCHAR(255), priority INTEGER);

DROP SEQUENCE IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START 1;


DROP TABLE IF EXISTS termek;
CREATE TABLE termek(
                       id VARCHAR(20) PRIMARY KEY,
                       ar VARCHAR(255),
                       leiras VARCHAR(255));


DROP TABLE IF EXISTS tranzakcio;
CREATE TABLE tranzakcio(
                           id SERIAL PRIMARY KEY,
                           termek_id VARCHAR(20),
                           datum TIMESTAMP DEFAULT NULL,
                           ar INTEGER,
                           osszeg INTEGER);

DROP SEQUENCE IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START 1;