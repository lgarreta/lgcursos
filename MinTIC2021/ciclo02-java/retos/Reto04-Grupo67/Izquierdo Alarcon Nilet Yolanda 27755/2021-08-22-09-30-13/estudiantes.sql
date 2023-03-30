-- Se recomienda para esta practica dejar como nombre de tabla estudiantes, 
-- Este sería un ejemplo de script sql para sqlite tenerlo presente 
-- porque puede cambiar un poco respecto al que realizaron

CREATE TABLE estudiantes (
	id	INTEGER NOT NULL UNIQUE,
	Nombre	TEXT NOT NULL,
	Apellido	TEXT NOT NULL,
	fNacimiento	TEXT NOT NULL,
	cInstitucional	TEXT NOT NULL,
	cPersonal	TEXT NOT NULL,
	celular	INTEGER NOT NULL DEFAULT 0,
	fijo	INTEGER NOT NULL DEFAULT 0,
	programa	INTEGER NOT NULL,
	PRIMARY KEY(id AUTOINCREMENT)
);