--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.6.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

CREATE TABLE cidade (
    id integer NOT NULL,
    nome character varying(100),
    uf character varying
);

CREATE SEQUENCE cidade_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE cidade_id_seq OWNED BY cidade.id;

CREATE TABLE endereco (
    id integer NOT NULL,
    nome character varying(100),
    id_cidade integer
);

CREATE SEQUENCE endereco_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE endereco_id_seq OWNED BY endereco.id;

INSERT INTO cidade (id, nome, uf) VALUES (1, 'CUIABA', 'MT');
INSERT INTO cidade (id, nome, uf) VALUES (2, 'VARZEA GRANDE', 'MT');
INSERT INTO cidade (id, nome, uf) VALUES (3, 'CHAPADA DOS GUIMARAES', 'MT');
INSERT INTO cidade (id, nome, uf) VALUES (4, 'NOBRES', 'MT');
INSERT INTO cidade (id, nome, uf) VALUES (5, 'BARRA DO BUGRES', 'MT');
INSERT INTO cidade (id, nome, uf) VALUES (6, 'FORTALEZA', 'CE');
INSERT INTO cidade (id, nome, uf) VALUES (7, 'FLORIANOPOLIS', 'SC');

SELECT pg_catalog.setval('cidade_id_seq', 1, false);

INSERT INTO endereco (id, nome, id_cidade) VALUES (4, 'RUA 4', 1);
INSERT INTO endereco (id, nome, id_cidade) VALUES (2, 'RUA 2', 3);
INSERT INTO endereco (id, nome, id_cidade) VALUES (3, 'RUA 3', 6);
INSERT INTO endereco (id, nome, id_cidade) VALUES (1, 'RUA 1', 7);

SELECT pg_catalog.setval('endereco_id_seq', 1, false);

ALTER TABLE ONLY cidade
    ADD CONSTRAINT pk_cidade PRIMARY KEY (id);
	
ALTER TABLE ONLY endereco
    ADD CONSTRAINT pk_endereco PRIMARY KEY (id);

CREATE INDEX fki_fk_cidade ON endereco USING btree (id_cidade);

ALTER TABLE ONLY endereco
    ADD CONSTRAINT fk_cidade FOREIGN KEY (id_cidade) REFERENCES cidade(id);

REVOKE ALL ON SCHEMA public FROM PUBLIC;
