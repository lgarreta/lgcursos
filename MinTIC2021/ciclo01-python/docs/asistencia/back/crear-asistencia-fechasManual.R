#!/usr/bin/Rscript
source ("lglib09.R")

# Open imported asistencia
attendedDF = read.csv ("AttendanceExport-Junio03.csv")
fechas     = as.character (unique (sort (attendedDF[,2])))
nFechas      = length (fechas)

view (fechas)
view (attendedDF)

estudiantes = read.csv ("lista-datos-grupo67.csv", row.names=4)
nEst = nrow (estudiantes)

fechasClasesDF = data.frame (matrix(0, nrow=nEst, ncol=nFechas))
colnames (fechasClasesDF) = fechas

#fechasClases = read.csv ("fechas-clases-mayo.csv")
#fechasNames  = as.character (fechasClases[,1])

#fechasNames = sapply (fechasNames, function (x){strsplit (x, "/")[[1]][3]})


asistenciaDF = data.frame (CORREO=row.names (estudiantes), fechasClasesDF, check.names =F, row.names=1)
write.csv (asistenciaDF, "asistencia-sinProcesar.csv", row.names=T, quote=T)
view (asistenciaDF)

for (i in 1:nrow (attendedDF)) {
	session = as.character (attendedDF [i,2])
	correo  = as.character (attendedDF [i,5])

	#session = as.character (reg [2])
	#correo  = as.character (reg [5])
	message (i, ": ", session, ", ", correo)
	if (session %in% fechas)
		asistenciaDF [correo, session] = 1
}

asistenciaDF [is.na (asistenciaDF)] = 0
write.csv (asistenciaDF, "asistencia-procesada.csv", row.names=T, quote=T)


