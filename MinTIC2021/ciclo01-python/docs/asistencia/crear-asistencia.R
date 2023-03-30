#!/usr/bin/Rscript
source ("lglib09.R")
suppressMessages  (library (dplyr))

options (width=300, warn=0)
args = commandArgs(trailingOnly = TRUE)

# Open imported asistencia
#attendedDF = read.csv ("Attendance_Export-Junio25.csv")
attendedDF = read.csv (args[1])
fechas     = as.character (unique (sort (attendedDF[,2])))
nFechas    = length (fechas)

estudiantes = read.csv ("lista-datos-grupo67.csv", row.names=4)
nEst = nrow (estudiantes)

fechasClasesDF = data.frame (matrix(0, nrow=nEst, ncol=nFechas))
colnames (fechasClasesDF) = fechas

correos = row.names (estudiantes)
asistenciaDF = data.frame (ID=row.names (estudiantes), CORREO=correos, NOMBRE=rep("", nEst), fechasClasesDF, check.names =F, row.names=1)
write.csv (asistenciaDF, "asistencia-sinProcesar.csv", row.names=T, quote=T)

nombres = c()
for (i in 1:nrow (attendedDF)) {
	session = as.character (attendedDF [i,2])
	nombre  = as.character (attendedDF [i,4])
	correo  = as.character (attendedDF [i,5])

	message (i, ": ", session, ", ", correo)
	if (session %in% fechas) {
		asistenciaDF [correo, session] = 1
	}
}

estudiantes = read.csv ("lista-datos-grupo67.csv")
asistenciaJoined = left_join (x=asistenciaDF, y=estudiantes, by=c("CORREO"="Correo"), keep=F)
asistenciaDF$NOMBRE = asistenciaJoined$NombreCompleto
asistenciaDF = asistenciaDF[,-1]

asistenciaDF [is.na (asistenciaDF)] = 0

# Calculate absenses
nAbsenses = rowSums (asistenciaDF==0)
view (nAbsenses)
asistenciaDF = data.frame (asistenciaDF, AUSENCIAS=nAbsenses, check.names=F)

write.csv (asistenciaDF, "asistencia-procesada.csv", row.names=T, quote=T)


