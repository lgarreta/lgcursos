CREATE TABLE estudiantes (
     
    nombres TEXT NOT NULL,
    apellidos TEXT NOT NULL,
    fechaNaci TEXT,
    correoInst TEXT NOT NULL PRIMARY KEY,
    correoPers TEXT ,
    numeroCel Integer ,
    numeroFijo Integer ,
    progAcade TEXT);

--INSERT INTO estudiantes ( id, name, email, website )
--VALUES (1, 'Pepe', 'pepe@hotmail.com','www.pepeton.com'); 