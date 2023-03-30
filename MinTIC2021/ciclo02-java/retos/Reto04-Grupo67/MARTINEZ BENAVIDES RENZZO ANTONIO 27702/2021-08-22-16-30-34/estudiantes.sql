CREATE TABLE estudiantes (
    id INTEGER NOT NULL PRIMARY KEY,
    nombres TEXT,
    apellidos TEXT,
    fechaNac TEXT,
    correoIns TEXT NOT NULL,
    correoPer TEXT,
    nroCelular INTEGER,
    nroFijo INTEGER,
    programa TEXT
);

--INSERT INTO estudiantes ( id, name, email, website )
--VALUES (1, 'Pepe', 'pepe@hotmail.com','www.pepeton.com'); 
