sqlite3 bd_estudiantes.db < estudiantes.sql
sqlite3 bd_estudiantes.db -cmd ".mode csv" ".import infoestudiantes.csv estudiantes" ".quit"
