-- Se recomienda para esta practica dejar como nombre de tabla estudiantes, 
-- Este sería un ejemplo de script sql para sqlite tenerlo presente 
-- porque puede cambiar un poco respecto al que realizaron
CREATE TABLE estudiantes (
    nombres TEXT,
    apellidos TEXT,
    fechaNacimiento TEXT,
    correoInstitucional TEXT NOT NULL,
    correoPersonal TEXT,
    numeroCelular LONG,
    numeroFijo INTEGER,
    programa TEXT
);